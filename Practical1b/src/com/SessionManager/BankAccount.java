package com.SessionManager;

public class BankAccount {
	private double accountBalance;

    public BankAccount(double initialAmount) {
        this.accountBalance = initialAmount;
    }

    public void displayBalance() {
        SessionManager session = SessionManager.getInstance();
        if (session.isSessionActive()) {
            System.out.println("Current User: " + session.getCurrentUser() + ", Balance:" + accountBalance);
        } else {
            System.out.println("Please log in to view the balance.");
        }
    }

}
