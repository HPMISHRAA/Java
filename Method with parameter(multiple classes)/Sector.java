class Demo 
{
	static void area(int r)
	{
		int theta=50;
        double result=0.5*r*r*theta;
		System.out.println(result);
	}
	
}
class Sector
{
	public static void main(String [] args)
	{
		Demo.area(15);
	}
}
