package com.example.spinwheel.utils;

import com.alibaba.fastjson.JSONObject;
import com.example.spinwheel.base.dto.ClassDTO;
import com.example.spinwheel.base.dto.OddsDTO;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static String sendPost(String url) {
        return null;
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
            String accessTokenResp = sendGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx581c631ff7ed0c70&secret=0d9340d2b107c65e58f1591291853754");
            JSONObject jsonObject = JSONObject.parseObject(accessTokenResp);
            String accessToken = jsonObject.getString("access_token");

            // 发送消息模板
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
