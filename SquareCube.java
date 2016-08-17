import java.util.Scanner;
class SquareCube
{
	public static void main(String[] arg)
	{
		Integer[] num;
		Integer n,sum=0,sum1=0,sum2=0,i;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n=in.nextInt();
		num=new Integer[n];
		System.out.println("Enter"+" "+n+" "+"numbers:");
		for(i=0;i<n;i++)
		num[i]=in.nextInt();

		for(i=0;i<n;i++)
		{
			if(i%2==0)
			sum1=sum1+num[i]*num[i];
			else
			sum2=sum2+num[i]*num[i]*num[i];
		}
		sum=sum1+sum2;
		System.out.println("Even position get Square & Odd position get Cube");
		System.out.println("Sum:"+sum);
		
	}
}