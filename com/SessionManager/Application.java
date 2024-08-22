package com.SessionManager;

public class Application {

	public static void main(String[] args) {
		SessionManager session = SessionManager.getInstance();
        session.authenticate("JohnDoe");

       
        BankAccount account = new BankAccount(500.00);
        account.displayBalance();   
        Balance balanceAccount = new Balance(500.00);
        balanceAccount.addFunds(100.00); 

        Withdrawl withdrawlAccount = new Withdrawl(500.00);
        withdrawlAccount.withdrawFunds(50.00); 

        
        session.endSession();
        account.displayBalance();   
        balanceAccount.addFunds(100.00);   
        withdrawlAccount.withdrawFunds(50.00); 
    }
}
