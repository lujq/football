package com.example.spinwheel.utils;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GenLogTagTool {
    public static final String LOG_TAG_SERVICE_NAME = "service";
    public static final String LOG_TAG_TIMESTAMP = "time";
    public static final String LOG_TAG_FUNCTION_NAME = "funcName";
    public static final String LOG_TAG_FLOW_NO = "flowNo";
    public static final String LOG_TAG_IP = "ip";
    public static final String LOG_TAG_HOST_NAME = "hostName";

    public GenLogTagTool() {
        super();
    }

    public static Map<String, String> genlogTag(String serviceName) {
        return genlogTag(serviceName, (String)null);
    }

    public static Map<String, String> genlogTag(String serviceName, String functionName) {
        Map<String,String> tags = new HashMap<>();
        if (isNoTrimEmpty(serviceName)) {
            tags.put("service", serviceName);
        }
        if (isNoTrimEmpty(functionName)) {
            tags.put("funcName", functionName);
        }
        tags.put("time", longToDateStr(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss"));
        return tags;
    }

    public static final boolean isNoTrimEmpty(Object obj) {
        return obj == null || obj.toString().trim().length() <= 0;
    }

    public static String longToDateStr(long longDate, String dateFormat) {
        if (longDate == 0L) {
            return null;
        } else {
            if (isNoTrimEmpty(dateFormat)) {
                dateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
            }
            SimpleDateFormat df = new SimpleDateFormat(dateFormat);
            return df.format(new Date(longDate));
        }
    }
}
