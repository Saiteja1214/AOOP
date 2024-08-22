package com.Payment;

public abstract class PaymentProcessor {
	 protected PaymentMethod paymentMethod;

	    public PaymentProcessor(PaymentMethod paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }

	    public abstract void process(double amount);
}
