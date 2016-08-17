import java.util.StringTokenizer;
class CountWord
{
	public static void main(String[] arg)
	{
		String str;
		Integer cnt=0;
		StringTokenizer st;
		System.out.print("Enter a sentence:");
		str=new java.util.Scanner(System.in).nextLine();
		st=new StringTokenizer(str," ,.");
		while(st.hasMoreTokens())
		{
			str=st.nextToken();
			cnt++;
		}
		System.out.println("No of words:"+cnt);
		
	}
}