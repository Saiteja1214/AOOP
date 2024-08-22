package com.Log;

public class LoggingApp {

	public static void main(String[] args) {
		LogProcessor infoProcessor = new InformationLogProcessor();
        LogProcessor debugProcessor = new DebugLogProcessor();
        LogProcessor errorProcessor = new ErrorLogProcessor();

        
        infoProcessor.setNextProcessor(debugProcessor);
        debugProcessor.setNextProcessor(errorProcessor);

        
        LoggingAction infoAction = new LoggingTask(infoProcessor);
        LoggingAction debugAction = new LoggingTask(debugProcessor);
        LoggingAction errorAction = new LoggingTask(errorProcessor);

        
        LogManager logManager = new LogManager();
        logManager.addAction(infoAction);
        logManager.addAction(debugAction);
        logManager.addAction(errorAction);

        // Execute actions
        logManager.executeActions();
    }

	}


