package PaymentSystem.test;

public class DebitCardPayment implements Payment
{
	public DebitCardPayment()
	{
		System.out.println("debit card object created");
	}
	
	@Override
	public boolean pay(double amount) {
		System.out.println("Debit card Payment processed....");
		return true;
	}
}
