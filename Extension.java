class Extension
{
	public static void main(String[] arg)
	{
		String str;
		System.out.print("Enter the file with file extension:");
		str=new java.util.Scanner(System.in).next();
		System.out.print(str.substring(str.indexOf(".")+1,str.length()));
	}
}






