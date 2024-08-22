package com.Log;

public class LoggingTask implements LoggingAction {
	 private final LogProcessor processor;

	    public LoggingTask(LogProcessor processor) {
	        this.processor = processor;
	    }

	    @Override
	    public void perform(String logMessage) {
	        processor.processLog(logMessage);
	    }
}
