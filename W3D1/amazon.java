package W3D1;

public class amazon extends canarabank
{

	@Override
	public void cashondelivery() 
	{
	System.out.println("COD");
	}

	@Override
	public void upipayments() 
	{
	System.out.println("UPI Payment");
	}

	@Override
	public void cardpayments() 
	{
	System.out.println("Card Payment");
		
	}

	@Override
	public void internetbanking() 
	{
	System.out.println("Internet Banking");
		
	}

	public static void main(String[] args) 
	{
	amazon a=new amazon();
	a.cardpayments();
	a.cashondelivery();
	a.internetbanking();
	a.upipayments();
	a.recordpaymentDetails("Card",5000.0);
    }


}
