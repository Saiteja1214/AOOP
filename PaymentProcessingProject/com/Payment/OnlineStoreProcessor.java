package com.Payment;

public class OnlineStoreProcessor extends PaymentProcessor {

	public OnlineStoreProcessor(PaymentMethod paymentMethod) {
		super(paymentMethod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		  System.out.println("Online store payment processing initiated...");
	        paymentMethod.processPayment(amount);
	        System.out.println("Online store payment processing completed.");
	    }
	}
	 

