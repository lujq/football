package com.example.spinwheel.utils;

import com.alibaba.fastjson.JSONObject;
import com.example.spinwheel.base.dto.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import redis.clients.jedis.Jedis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.springframework.http.HttpHeaders.USER_AGENT;

public class RealtimeOddsUtil {
    private static LoggerManager logger = LoggerManager.getLogger(RealtimeOddsUtil.class);
    public static String sendGet(String url) {
        JSONObject jsonObject = null;
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try {
            client = HttpClients.createDefault();
            URIBuilder uriBuilder = new URIBuilder(url);
            HttpGet httpGet = new HttpGet(uriBuilder.build());
            httpGet.setHeader(new BasicHeader("Content-Type","application/x-www-form-urlencoded"));
            httpGet.setHeader(new BasicHeader("Accept", "application/json;charset=utf-8"));
            response = client.execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            if (200 == statusCode) {
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity, "UTF-8");
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String sendPost(String accesstoken, String home, String guest) throws Exception {

        String url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        //添加请求头
        post.setHeader("User-Agent", USER_AGENT);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("touser", "oY9RC5pjrq2xeW2q_RnxjGxt-Y50"));
        urlParameters.add(new BasicNameValuePair("template_id", "7PJRIU8el3GGblNAir1dxbuAu7fU1dV-fz0Y02zLsMc"));
        JSONObject json = new JSONObject();
        JSONObject dataJson = new JSONObject();
        dataJson.put("first", sdf.format(new Date()));
        dataJson.put("keyword1", "足球大数据通知");
        dataJson.put("keyword2", "比赛投注提醒");
        dataJson.put("keyword3", "【"+home+"】 vs 【"+guest+"】");
        json.put("data", dataJson);
        urlParameters.add(new BasicNameValuePair("data", json.toJSONString()));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
        return result.toString();

    }

    public static String sendTemplate(String accessToken, String home, String guest) {
        String tepUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="
                + accessToken;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(tepUrl);
        // 装配post请求参数
        JSONObject json = new JSONObject();
        json.put("touser", "oY9RC5pjrq2xeW2q_RnxjGxt-Y50");
        json.put("template_id", "7PJRIU8el3GGblNAir1dxbuAu7fU1dV-fz0Y02zLsMc");
        json.put("url", "https://www.baidu.com");
        JSONObject dataJson = new JSONObject();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        dataJson.put("first", sdf.format(new Date()));
        dataJson.put("keyword1", "足球大数据通知");
        dataJson.put("keyword2", "比赛投注提醒");
        dataJson.put("keyword3", "【"+home+"】 vs 【"+guest+"】");
        DataDTO dataDTO = new DataDTO();
        dataDTO.setTouser("oY9RC5pjrq2xeW2q_RnxjGxt-Y50");
        dataDTO.setTemplate_id("7PJRIU8el3GGblNAir1dxbuAu7fU1dV-fz0Y02zLsMc");
        NewsTemplateDTO newsTemplateDTO = new NewsTemplateDTO();
        CommonTemplateDTO c1 = new CommonTemplateDTO();
        c1.setValue(sdf.format(new Date()));
        newsTemplateDTO.setFirst(c1);
        json.put("data", JSONObject.toJSONString(newsTemplateDTO));
        dataDTO.setData(newsTemplateDTO);
        HttpResponse httpResponse = null;
        String resultStr = "发送失败";
        try {
            StringEntity myEntity = new StringEntity(JSONObject.toJSONString(dataDTO));
            myEntity.setContentEncoding("UTF-8");
            myEntity.setContentType("application/json");
            // 设置post求情参数
            httpPost.setEntity(myEntity);
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
            httpResponse = httpClient.execute(httpPost);


            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                // 发送成功
                String resutlEntity = EntityUtils.toString(httpResponse.getEntity());
                ResultTemplateDate resultTemplateDate = JSONObject.parseObject(resutlEntity, ResultTemplateDate.class);
                if (resultTemplateDate.getErrcode().equals("40037")) {
                    resultStr = "template_id不正确";
                }
                if (resultTemplateDate.getErrcode().equals("41028")) {
                    resultStr = "form_id不正确，或者过期";
                }
                if (resultTemplateDate.getErrcode().equals("41029")) {
                    resultStr = "form_id已被使用";
                }
                if (resultTemplateDate.getErrcode().equals("41030")) {
                    resultStr = "page不正确";
                }
                if (resultTemplateDate.getErrcode().equals("45009")) {
                    resultStr = "接口调用超过限额（目前默认每个帐号日调用限额为100万）";
                }
                resultStr = resultTemplateDate.getErrmsg();
                return resultStr;
            } else {
                // 发送失败
                return resultStr;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    public static List<OddsDTO> readRealtimeOdds() {
        String url = "http://interface.win007.com/zq/odds.aspx";
        String rawResult = sendGet(url);
        if (null != rawResult){
            String[] result = rawResult.split("\\$");
            // 释放内存
            rawResult = null;
            // 联赛信息
            String[] classes = result[0].split(";");
            // 当期比赛
            String[] schedules = result[1].split(";");
            // 实时让球盘
            String[] letGoals = result[2].split(";");
            // 实时大小球
            String[] totalGoals = result[4].split(";");

            // 联赛清单
            Map<String, String> leagues = new HashMap<>();
            for (int i = 0; i < classes.length; i++) {
                String[] classDetail = classes[i].split(",");
                if(classDetail[1].equals("1")) {
                    leagues.put(classDetail[0],classDetail[3]);
                }
            }
            classes = null;

            List<OddsDTO> scheduleList = new ArrayList<>();
            Map<String,OddsDTO> matches = new HashMap<>();
            // 中场比赛清单
            for (int i = 0; i < schedules.length; i++) {
                String[] scheduleDetail = schedules[i].split(",");
                if (scheduleDetail[14].equals("2") && leagues.containsKey(scheduleDetail[1])) {
                    OddsDTO oddsDTO = new OddsDTO();
                    oddsDTO.setScheduleId(scheduleDetail[0]);
                    oddsDTO.setClassId(scheduleDetail[1]);
                    oddsDTO.setClassName(leagues.get(scheduleDetail[1]));
                    oddsDTO.setClassType("1");
                    oddsDTO.setHomeScore(scheduleDetail[15]);
                    oddsDTO.setGuestScore(scheduleDetail[16]);
                    oddsDTO.setHomeName(scheduleDetail[5]);
                    oddsDTO.setGuestName(scheduleDetail[10]);
                    oddsDTO.setHomeRed(scheduleDetail[20]);
                    oddsDTO.setGuestRed(scheduleDetail[21]);
                    scheduleList.add(oddsDTO);
                    matches.put(oddsDTO.getScheduleId(), oddsDTO);
                }
            }
            schedules = null;


            List<OddsDTO> resultList = new ArrayList<>();
            Map<String,OddsDTO> realMatches = new HashMap<>();
            // 让球盘
            for(int i = 0; i < letGoals.length; i++) {
                String[] letGoalDetail = letGoals[i].split(",");
                if (letGoalDetail[1].equals("3") && matches.containsKey(letGoalDetail[0])) {
                    OddsDTO odd = matches.get(letGoalDetail[0]);
                    Double firstGoal = Double.parseDouble(letGoalDetail[2]);
                    if (-0.5 <= firstGoal && firstGoal <= 0.25) {
                        realMatches.put(odd.getScheduleId(), odd);
                    }

                }
            }
            matches = null;

            // 大小球
            for(int i = 0; i < totalGoals.length; i++) {
                String[] totalGoalDetail = totalGoals[i].split(",");
                if (totalGoalDetail[1].equals("3") && realMatches.containsKey(totalGoalDetail[0])) {
                    OddsDTO odd = realMatches.get(totalGoalDetail[0]);
                    Double firstGoal = Double.parseDouble(totalGoalDetail[2]);
                    Double goal = Double.parseDouble(totalGoalDetail[5]);
                    Integer score = Integer.parseInt(odd.getHomeScore()) + Integer.parseInt(odd.getGuestScore());
                    if (2 <= firstGoal && firstGoal < 3 && score == 2 && 3 < goal && goal <= 3.5) {
                        resultList.add(odd);
                    }
                }
            }

            // 微信通知

            // 获取access_token
            Jedis jedis = new Jedis("192.168.10.4");
            String accessToken = null;
            if (jedis.exists("spinwheel_access_token")){
                accessToken = jedis.get("spinwheel_access_token");
            } else {
                String accessTokenResp = sendGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx581c631ff7ed0c70&secret=0d9340d2b107c65e58f1591291853754");
                JSONObject jsonObject = JSONObject.parseObject(accessTokenResp);
                accessToken = jsonObject.getString("access_token");
                jedis.set("spinwheel_access_token", accessToken);
                jedis.expire("spinwheel_access_token", 15*60);
            }

            // 发送消息模板
            if (jedis.exists("spinwheel_schedule_list")){
                Set<String> existedSchedules = jedis.smembers("spinwheel_schedule_list");
                for (OddsDTO dto : resultList) {
                    if (existedSchedules.contains(dto.getScheduleId())) {
                        continue;
                    } else {
                        try {
                            sendTemplate(accessToken, dto.getHomeName(), dto.getGuestName());
                            jedis.sadd("spinwheel_schedule_list", dto.getScheduleId());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            String templateResp = sendGet("");

        }
        return null;
    }



    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key","123");
        map.put("key1", "2");
        map.put("key2", "2");
        map.put("key3", "1");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }
        if(map.containsKey("key5")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        readRealtimeOdds();
    }
}
