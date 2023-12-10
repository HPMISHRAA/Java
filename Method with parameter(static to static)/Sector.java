class Sector
{
	static void area(int r)
	{
		int theta=50;
	
		double result=0.5*r*r*theta;
		System.out.println(result);
	}
		public static void main(String [] args)
	{
		area(15);
	}
}