package com.Log;

public abstract class LogProcessor {
	 protected LogProcessor subsequentProcessor;

	    public void setNextProcessor(LogProcessor nextProcessor) {
	        this.subsequentProcessor = nextProcessor;
	    }

	    public abstract void processLog(String logMessage);
}
