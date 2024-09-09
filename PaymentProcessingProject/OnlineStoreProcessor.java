package PaymentProcessingProject;

public class OnlineStoreProcessor implements PaymentProcessor{
	public OnlineStoreProcessor(PaymentMethod paymentMethod) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		  System.out.println("Online store payment processing initiated...");
	        PaymentMethod.processPayment(amount);
	        System.out.println("Online store payment processing completed.");
	    }
}
