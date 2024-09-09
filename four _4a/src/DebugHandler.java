public class DebugHandler extends LogHandler {

    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
