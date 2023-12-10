class Circle
{
	static double area()
	{
		final double pi=3.14;
		int r=5;
		double result=pi*r*r;
		return result;
	}
		public static void main(String [] args)
	{
		double y=area();
		System.out.println(y);
	}
}