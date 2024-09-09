public class Client {
    public static void main(String[] args) {
        
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        
        Logger logger = new Logger();

        
        logger.addCommand(new LogCommand(LogLevel.INFO, "System started", infoHandler));
        logger.addCommand(new LogCommand(LogLevel.DEBUG, "Debugging mode on", debugHandler));
        logger.addCommand(new LogCommand(LogLevel.ERROR, "System error occurred", errorHandler));

        
        logger.processCommands();
    }
}

