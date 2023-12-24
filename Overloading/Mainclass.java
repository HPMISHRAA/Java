class WhatsApp 
{
	static void send(String textmsg) 
	{
		System.out.println("sending textmsg");
	}
	static void send(int no)
	{
		System.out.println("sending no");
	}
	static void send(int no,String textmsg)
	{
		System.out.println("sending no&sending textmsg "+no+" "+textmsg);
    }
	static void send(String textmsg,int no)
	{
		System.out.println("sending textmsg&no "+textmsg+" "+no);

	}
}
class Mainclass
{
	public static void main(String [] args)
	{
		WhatsApp w=new WhatsApp();
		w.send(26);
		w.send("hllw");
		w.send(26,"hii");
		w.send("hello",52);

	}
}
