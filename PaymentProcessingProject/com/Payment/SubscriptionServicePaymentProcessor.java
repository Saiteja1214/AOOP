package com.Payment;

public  class SubscriptionServicePaymentProcessor extends PaymentProcessor{

	public SubscriptionServicePaymentProcessor(PaymentMethod paymentMethod) {
		super(paymentMethod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("Subscription service payment processing initiated...");
	        paymentMethod.processPayment(amount);
	        System.out.println("Subscription service payment processing completed.");
	    
	}

}
