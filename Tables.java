import java.util.Scanner;
class Tables
{
	public static void main(String[] hello)
	{
		Scanner in=new Scanner(System.in);
		Integer i,j,m=0;
		System.out.print("Enter the number for Multiplication table:");
		i=in.nextInt();
		for(j=1;j<=10;j++)
		{
		m=j*i;
		System.out.println(j+""+"x"+""+i+"="+m);
		}
	}
}