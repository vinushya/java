class Reverse
{
	public static void main(String[] arg)
	{
		Integer i,temp=0,n=0;
		System.out.print("Enter the integer to reverse:");
		i=new java.util.Scanner(System.in).nextInt();
		while(i!=0)
		{
			temp=i;
			n=temp%10;
			System.out.print(n);
			i=temp/10;	
		}
	}
}