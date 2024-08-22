package com.SessionManager;

public class Balance {
	private double currentBalance;

    public Balance(double initialAmount) {
        this.currentBalance = initialAmount;
    }

    public void addFunds(double amount) {
        SessionManager session = SessionManager.getInstance();
        if (session.isSessionActive()) {
            currentBalance += amount;
            System.out.println("Added $" + amount + " to account. Updated Balance: $" + currentBalance);
        } else {
            System.out.println("You must be logged in to add funds.");
        }
    }
}
