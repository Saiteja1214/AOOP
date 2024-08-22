package com.Log;

public class ErrorLogProcessor extends LogProcessor {
	  @Override
	    public void processLog(String logMessage) {
	        if (logMessage.contains("ERROR")) {
	            System.out.println("Error: " + logMessage);
	        } else if (subsequentProcessor != null) {
	            subsequentProcessor.processLog(logMessage);
	        }
	    }
}
