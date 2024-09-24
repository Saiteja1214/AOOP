package com.Practical9b;

public class BankTransactionTest {
	public static void main(String[] args) {
      BankAccount account = new BankAccount(100);
      Thread user1=new Thread(() ->{
    	  account.deposit(2000);
    	  account.deposit(3000);
      }, "User1");
      Thread user2 = new Thread(() ->{
    	  account.deposit(3000);
    	  account.deposit(4000);
      }, "User2");
      user1.start();
      user2.start();
     
    	
    	try {
            user1.join();
            user2.join();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}

