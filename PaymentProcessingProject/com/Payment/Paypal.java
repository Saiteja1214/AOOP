package com.Payment;

public class Paypal implements PaymentMethod{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("Processing credit card payment of $" + amount);
	}

}