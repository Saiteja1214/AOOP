package com.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LogManager {
	private final List<LoggingAction> actions = new ArrayList<>();

    public void addAction(LoggingAction action) {
        actions.add(action);
    }

    public void executeActions() {
        Iterator<LoggingAction> iterator = actions.iterator();
        while (iterator.hasNext()) {
            LoggingAction action = iterator.next();
            action.perform("INFO: Sample log entry");
        }
    }
}
