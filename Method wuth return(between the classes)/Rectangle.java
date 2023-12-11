class Demo 
{
	static int area()
	{
		int b=50;
		int a=10;
		int result=a*b;
        return result;
	}
}
class Rectangle
{
	public static void main(String[] args) 
	{
		int y=Demo.area();
		System.out.println(y);
	}
}
