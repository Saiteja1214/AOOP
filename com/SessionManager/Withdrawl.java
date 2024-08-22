package com.SessionManager;

public class Withdrawl {
	  private double accountBalance;

	    public Withdrawl(double initialAmount) {
	        this.accountBalance = initialAmount;
	    }

	    public void withdrawFunds(double amount) {
	        SessionManager session = SessionManager.getInstance();
	        if (session.isSessionActive()) {
	            if (accountBalance >= amount) {
	                accountBalance -= amount;
	                System.out.println("Withdrawn $" + amount + ". Updated Balance: $" + accountBalance);
	            } else {
	                System.out.println("Not enough funds available.");
	            }
	        } else {
	            System.out.println("You need to log in to withdraw funds.");
	        }
	    }
}
