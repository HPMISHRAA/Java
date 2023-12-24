class BookMyShow 
{
	void book(int no_tkt) 
	{
		System.out.println("book by no tkt");
	}
	 void book(String movie_name)
	{
		System.out.println("book by movie name");
    }
	 void book(int no_tkt,String movie_name)
	{
		System.out.println("book by no tkt&movie name "+no_tkt+" "+movie_name);

	}
	 void book(String movie_name,int no_tkt)
	{
		System.out.println("movie name&book by no tkt "+movie_name+" "+no_tkt);

	}


}
class Main
{
	public static void main(String [] args)
	{
		BookMyShow b=new BookMyShow();
		b.book(5);
		b.book("Animal");
		b.book(10,"Animal");
		b.book("Animal",15);
	}
}