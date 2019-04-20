package com.example.spinwheel.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;

public class LoggerManager {
    private Logger logger;

    public LoggerManager(Class<? extends Object> clz) {
        this.logger = LogManager.getLogger(clz);
    }

    public static LoggerManager getLogger(Class<? extends Object> clz) {
        return new LoggerManager(clz);
    }

    public void access(String message) {
        MDC.put("logType", "ACCESS");
        this.logger.info(this.genLogMsgWithTags(message));
    }

    public void access(String message, Map<String, String> tagMap) {
        MDC.put("logType", "ACCESS");
        this.logger.info(this.genLogMsgWithTags(tagMap, message));
    }

    public void debug(String message) {
        MDC.put("logType", "EVENT");
        this.logger.debug(this.genLogMsgWithTags(message));
    }

    public void debug(String message, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.debug(this.genLogMsgWithTags(tagMap, message));
    }

    public void info(String message) {
        MDC.put("logType", "EVENT");
        this.logger.info(this.genLogMsgWithTags(message));
    }

    public void info(String message, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.info(this.genLogMsgWithTags(tagMap, message));
    }

    public void warn(String message) {
        MDC.put("logType", "EVENT");
        this.logger.warn(this.genLogMsgWithTags(message));
    }

    public void warn(String message, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.warn(this.genLogMsgWithTags(tagMap, message));
    }

    public void error(String message) {
        MDC.put("logType", "EVENT");
        this.logger.error(this.genLogMsgWithTags(message));
    }

    public void error(String message, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.error(this.genLogMsgWithTags(tagMap, message));
    }

    public void error(String message, Throwable e) {
        MDC.put("logType", "EVENT");
        this.logger.error(this.genLogMsgWithTags(message + this.getExceptionAllinformation(e)));
    }

    public void error(String message, Throwable e, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.error(this.genLogMsgWithTags(tagMap, message + this.getExceptionAllinformation(e)));
    }

    public void fatal(String message) {
        MDC.put("logType", "EVENT");
        this.logger.fatal(this.genLogMsgWithTags(message));
    }

    public void fatal(String message, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.fatal(this.genLogMsgWithTags(tagMap, message));
    }

    public void fatal(String message, Throwable e) {
        MDC.put("logType", "EVENT");
        this.logger.fatal(this.genLogMsgWithTags(message + this.getExceptionAllinformation(e)));
    }

    public void fatal(String message, Throwable e, Map<String, String> tagMap) {
        MDC.put("logType", "EVENT");
        this.logger.fatal(this.genLogMsgWithTags(tagMap, message + this.getExceptionAllinformation(e)));
    }

    private String getExceptionAllinformation(Throwable ex) {
        if (ex == null) {
            return "";
        } else {
            String sOut = "\r\n" + ex.toString() + "\r\n";
            StackTraceElement[] trace = ex.getStackTrace();
            StackTraceElement[] var7 = trace;
            int var6 = trace.length;
            for (int var5 = 0; var5 < var6; ++var5) {
                StackTraceElement s = var7[var5];
                sOut = sOut + "\tat " + s + "\r\n";
            }
            return sOut;
        }
    }

    private String genLogMsgWithTags(String message) {
        return this.genLogMsgWithTags((Map) null, message);
    }

    private String genLogMsgWithTags(Map<String, String> tagMap, String message) {
        if (tagMap != null && !((Map) tagMap).isEmpty()) {
            ((Map) tagMap).put("msg", message == null ? "" : message.replaceAll("'", " ").replaceAll("\"", " "));
        } else {
            tagMap = new HashMap();
            ((Map) tagMap).put("msg", message == null ? "" : message.replaceAll("'", " ").replaceAll("\"", " "));
        }

        String msgJson = JSON.toJSONString(tagMap);
        return msgJson;
    }
}