class Swiggy 
{
	static void food(String name) 
	{
		System.out.println("Delicious food");
	}
	static void food(int price)
	{
		System.out.println("lower price");
	
	}
	static void food(int price,String name)
	{
	   System.out.println("Food should be delicious&cheaply");

	}
	static void food(String name,int price)
	{
	   System.out.println("Food should be delicious&cheaply");
	
	}

}
class Menu
{
	public static void main(String [] args)
	{
		Swiggy.food("Dhokla");
		Swiggy.food(250);
		Swiggy.food(250,"Dhokla");
		Swiggy.food("Dhokla",250);




	}
}

