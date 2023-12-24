class Upi 
{
	static void payment(String scanner) 
	{
		System.out.println("Payment done");
	}
	static void payment(int no)
	{
		System.out.println("provide mobiele no for payment "+no);
	
	}

}
class Payment
{
	public static void main(String [] args)
	{
		Upi.payment("google pay");
		Upi.payment(9900);

	}
}

