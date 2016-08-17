import java.util.Scanner;
class Length
{
	public static void main(String[] arg)
	{
		String[] str;
		Integer n,i,len=0,cnt=0,s;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n=in.nextInt();
		str=new String[n];
		System.out.println("Enter"+" "+n+" "+"String:");
		for(i=0;i<n;i++)
			str[i]=in.next();
		System.out.print("Enter a length of a string to find:");
		len=in.nextInt();

		for(i=0;i<n;i++)
		{
			s=str[i].length();
			if(s==len) cnt++;
		}
		System.out.print("No.of words are of given Length is:"+cnt);
	}
}