class Circle
{
	static void area(int r)
	{
		final double pi=3.14;
		double area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String [] args)
	{
		area(3);
		area(4);
	}
}