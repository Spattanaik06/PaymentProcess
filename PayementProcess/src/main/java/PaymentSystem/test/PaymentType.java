package PaymentSystem.test;

public class PaymentType 
{
	Payment payment;

	public PaymentType(Payment payment) {
		super();
		this.payment = payment;
	}

	public PaymentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void paymentProcess(double amount)
	{
		boolean status=payment.pay(amount);
		if(status)
		{
			System.out.println("payment processed successfully.....");
		}
		else
		{
			
			System.out.println("system fails");
		}
	}

}
