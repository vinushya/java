import java.util.Scanner;
class Exit 
{
	public static void main(String[] hello)throws java.io.IOException
	{
		Scanner in=new Scanner(System.in);
		char ch;
		System.out.print("Enter the characters(Press q to exit):");
		ch=(char)System.in.read();
		if((ch=='q')||(ch=='Q'))
			System.exit(0);
		else
			System.out.println(ch);		
		
	}	
}










