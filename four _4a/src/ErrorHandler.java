public class ErrorHandler extends LogHandler {

    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.ERROR;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("[ERROR] " + message);
    }
}
