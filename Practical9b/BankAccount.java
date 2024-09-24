package com.Practical9b;

public class BankAccount {
 private double balance;
 public BankAccount(int initbalance) {
	 this.balance=initbalance;
       }
  public synchronized void deposit(double amount) {
	  if(amount>0) {
		  balance+=amount;
		  System.out.println(Thread.currentThread().getName() +  "Deposited"  + amount);
	  }
  }
  public synchronized void withdraw(double amount) {
	  if(amount>0 && amount<balance) {
		  balance-=amount;
		  System.out.println(Thread.currentThread().getName() +  "Withdrawed"  + amount);
	  }
	  else {
		  System.out.println(Thread.currentThread().getName() +  "tried to withdraw " + amount);
	  }
  }
  public synchronized double getBalance() {
	  return balance;
  }
}
