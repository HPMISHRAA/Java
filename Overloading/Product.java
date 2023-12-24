class Flipkart
{
	static void search(String name) 
	{
		System.out.println("search by name");
	}
	static void search(int age)
	{
		System.out.println("search by age");
	
	}
	static void search(String color,int price)
	{
		System.out.println("search by color and price");

	}


}
class Product
{
	public static void main(String [] args)
	{
		Flipkart.search("woolen cloths");
		Flipkart.search(25);
		Flipkart.search("black",2500);



	}
}

