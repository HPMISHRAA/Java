class  Demo
{
	static double area() 
	{
     int r=15;
	 final double pi=3.14;
	 double result=pi*r*r;
	 return result;
	}
}
class Circle
{
	public static void main(String [] args)
	{
		double y=Demo.area();
		System.out.println(y);
	}
}
