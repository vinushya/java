class Pattern
{
	public static void main(String[] arg)
	{
		int n,y;
		System.out.print("Enter value for pattern:");
		n=new java.util.Scanner(System.in).nextInt();
		y=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(y-1)*2;j++)
				System.out.print(" ");	
			--y;
			for(int x=1;x<=i;x++)
				System.out.print(x+" ");
			for(int z=i-1;z>=1;z--)
				System.out.print(z+" ");	
			System.out.println();
		}
	}
}