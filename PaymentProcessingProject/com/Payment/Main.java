package com.Payment;

public class Main {
	public static void main(String[] args) {
        // Process a payment using Credit Card
        PaymentProcessor onlineStoreProcessor = new OnlineStoreProcessor(new CreditCard());
        onlineStoreProcessor.process(200.23);

        System.out.println();

        // Process a payment using PayPal
        PaymentProcessor subscriptionProcessor = new SubscriptionServicePaymentProcessor(new Paypal());
        subscriptionProcessor.process(99);

        System.out.println();

        // Process a payment using Cryptocurrency
        PaymentProcessor anotherOnlineStoreProcessor = new OnlineStoreProcessor(new CryptoCurrency());
        anotherOnlineStoreProcessor.process(345);
    }
}
