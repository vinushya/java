class power
{
	public static void main(String[] arg)
	{
		Integer x,y,z,a,b,sum=0;
		System.out.print("Enter the integer:");
		x=new java.util.Scanner(System.in).nextInt();
		y=x%10;
		while(x!=0)
		{
			z=x%10;
			b=z;
			for(int i=1;i<y;i++)
				b=z*b;
			sum=sum+b;
			x=x/10;
		}
		System.out.print("power:"+sum);
	}
}