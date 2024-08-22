package com.CreateVehicle;

public class RideHailingService {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthenticateService authService = AuthenticateService.getobj();
        authService.Login("Manoj");

        
        PaymentProcessorFactory paymentProcessorFactory = new CardPaymentFactory(); 
        PaymentProcessor paymentProcessor = paymentProcessorFactory.createProcessor();
        paymentProcessor.handlePayment(50.0);

        // Sign out user
        authService.Logout();
    }

	}


