import java.util.Scanner;
class OddNo
{
	public static void main(String[] arg)
	{
		Integer x,y;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Range of number:");
		x=in.nextInt();
		System.out.println("to");
		y=in.nextInt();
		System.out.println("Odd Numbers are:");
		
		for(int i=x;i<y;i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}
	}
}