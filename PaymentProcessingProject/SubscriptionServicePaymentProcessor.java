package PaymentProcessingProject;

public class SubscriptionServicePaymentProcessor implements PaymentProcessor{
	public SubscriptionServicePaymentProcessor(PaymentMethod paymentMethod) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void process(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("Subscription service payment processing initiated...");
	        PaymentMethod.processPayment(amount);
	        System.out.println("Subscription service payment processing completed.");
	    
	}
}
