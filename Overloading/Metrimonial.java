class Shaddi 
{
	static void findGirl(String cast) 
	{
		System.out.println("cast should be "+cast);
	}
	static void findGirl(int age)
	{
		System.out.println("Girl should be of this age "+age);

	}
	static  void findGirl(int age,String cast)
	{
	    System.out.println("Girl should be of this cast&age "+cast+" "+age);
	
	}
    static  void findGirl(String cast,int age)
	{
		 System.out.println("Girl should be of this age&cast "+age+" "+cast);
	
	}

}
class Metrimonial
{
	public static void main(String [] args)
	{
		Shaddi s=new Shaddi();
		s.findGirl("Brahmin");
		s.findGirl(25);
		s.findGirl("Brahmin",25);
		s.findGirl(25,"Brahmin");
	}
}
