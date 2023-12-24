class Demo 
{
	public static void main(String[] args) 
	{
		boolean [] arr=new boolean[4];
		arr[0]=true;
		arr[1]=true;
		arr[2]=false;
		arr[3]=true;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
		}
		
	}
}
