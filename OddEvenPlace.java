class OddEvenPlace
{
	public static void main(String[] arg)
	{
		String str;
		System.out.print("Enter a String:");
		str=new java.util.Scanner(System.in).next();
		System.out.print("Even and Odd position:");
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			System.out.print(str.charAt(i));
		}
		
		System.out.print("    ");

		for(int j=0;j<str.length();j++)
		{
			if(j%2!=0)
			System.out.print(str.charAt(j));
		}
	}
}