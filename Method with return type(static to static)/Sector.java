class Sector
{
	static double area()
	{
		int r=10;
		int theta=50;
        double result=0.5*r*r*theta;
	    return result;

	}
		public static void main(String [] args)
	{
		double y=area();
		System.out.println(y);

	}
}