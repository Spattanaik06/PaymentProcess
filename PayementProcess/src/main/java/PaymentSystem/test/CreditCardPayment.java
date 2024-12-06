package PaymentSystem.test;

public class CreditCardPayment implements Payment
{
	public CreditCardPayment()
	{
		System.out.println("credit card object created");
	}
	
	@Override
	public boolean pay(double amount) {
		System.out.println("credit card Payment processed....");
		return true;
	}
	
}
