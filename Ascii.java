import java.util.Scanner;
class Ascii
{
	public static void main(String[] arg)
	{
		char ch;
		Scanner in=new Scanner(System.in);
		System.out.print("ASCII value:");

		for(int a=0;a<=256;a++)
		{
			System.out.print(a+"="+(char)a+" ,");
		}
		
	}
}