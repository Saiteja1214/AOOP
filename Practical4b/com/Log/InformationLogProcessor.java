package com.Log;

public class InformationLogProcessor extends LogProcessor{
	 @Override
	    public void processLog(String logMessage) {
	        if (logMessage.contains("INFO")) {
	            System.out.println("Information: " + logMessage);
	        } else if (subsequentProcessor != null) {
	            subsequentProcessor.processLog(logMessage);
	        }
	    }

}
