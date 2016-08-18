class Isogram
{
	public static void main(String[] arg)
	{
		String str;
		boolean status=true;
		System.out.print("Enter a word:");
		str=new java.util.Scanner(System.in).next();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				status=false;
			}
		}
		if(status==true)
		System.out.print(str+" "+"is a isogram");
		else
		System.out.print(str+" "+"is a not isogram");
	}
}