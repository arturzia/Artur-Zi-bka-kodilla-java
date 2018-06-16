package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstances = null;


    public static Logger getInstance() {
        if (loggerInstances == null) {
            synchronized(Logger.class) {
                if (loggerInstances == null) {
                    loggerInstances = new Logger();
                }
            }
        }
        return loggerInstances;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
