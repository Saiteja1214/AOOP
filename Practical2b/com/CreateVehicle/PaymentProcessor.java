package com.CreateVehicle;

public interface PaymentProcessor {
		 void handlePayment(double amount);
		}


		class CardPaymentProcessor implements PaymentProcessor {
		 @Override
		 public void handlePayment(double amount) {
		     System.out.println("Handling card payment of $" + amount);
		 }
		}


		class PayPalPaymentProcessor implements PaymentProcessor {
		 @Override
		 public void handlePayment(double amount) {
		     System.out.println("Handling PayPal payment of $" + amount);
		 }
		}


		abstract class PaymentProcessorFactory {
		 abstract PaymentProcessor createProcessor();
		}


		class CardPaymentFactory extends PaymentProcessorFactory {
		 @Override
		 PaymentProcessor createProcessor() {
		     return new CardPaymentProcessor();
		 }
		}


		class PayPalPaymentFactory extends PaymentProcessorFactory {
		 @Override
		 PaymentProcessor createProcessor() {
		     return new PayPalPaymentProcessor();
		 }
		}
		
