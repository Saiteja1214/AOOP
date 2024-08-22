package com.Log;

public class DebugLogProcessor extends LogProcessor{
	@Override
    public void processLog(String logMessage) {
        if (logMessage.contains("DEBUG")) {
            System.out.println("Debug: " + logMessage);
        } else if (subsequentProcessor != null) {
            subsequentProcessor.processLog(logMessage);
        }
    }

}
