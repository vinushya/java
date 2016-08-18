class middlePrint
{
	public static void main(String[] arg)
	{
		String str;
		Integer x,y,z;
		System.out.print("Enter the String:");
		str=new java.util.Scanner(System.in).next();
		x=str.length()/2;
		System.out.print("Printing star in middle of string:");
		for(int i=0;i<str.length();i++)
		{
			if(i==x)
			System.out.print("*");
			else
			System.out.print(str.charAt(i));
		}

		System.out.print("\nReversing the string:");
		for(int j=str.length()-1;j>=0;j--)
			System.out.print(str.charAt(j));

		System.out.print("\nPrinting star in middle of reverse string:");
		for(int j=str.length()-1;j>=0;j--)
		{
			if(j==str.length()/2)
			System.out.print("*");
			else
			System.out.print(str.charAt(j));
		}
	}
}