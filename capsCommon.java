class caps
{
	public static void main(String[] arg)
	{
		String str1,str2,x="",y="",u,v;
		int a=0,w=0,z=0;
		boolean status=true;
		System.out.print("Enter a String1:");
		str1=new java.util.Scanner(System.in).nextLine();
		u=str1;
		System.out.print("Enter a String2:");
		str2=new java.util.Scanner(System.in).nextLine();
		v=str2;

		//TO REMOVE STRING1 REPETATION
		for(int i=0;i<u.length();i++)
		{
			for(int j=i+1;j<u.length();j++)
			{
				if(u.charAt(i)==u.charAt(j))
				{
				x=(u.substring(0,j)+u.substring(j+1));	 
				w++;
				}
			}
		}
		if(w==0) x=str1;
		 
		
		//TO REMOVE STRING2 REPETATION
		for(int i=0;i<v.length();i++)
		{
			for(int j=i+1;j<v.length();j++)
			{
				if(v.charAt(i)==v.charAt(j))
				{
				y=(v.substring(0,j)+v.substring(j+1)); 
				z++;
				}
			}
		}
		if(z==0) y=str2;				

		//TO PRINT COMMON LETTERS IN CAPTIAL
		System.out.print("Repeated letter is Captailized:");

		for(int i=0;i<str1.length();i++)
		{
			status=true;
			for(int j=0;j<y.length();j++)
			{
				if(str1.charAt(i)==y.charAt(j))
				{
					a=str1.charAt(i)-32;
					status=false;
					System.out.print((char)a);
				}
			}
			if(status==true)
			System.out.print(str1.charAt(i));
		}

		System.out.print("  ");
		
		for(int i=0;i<str2.length();i++)
		{
			status=true;
			for(int j=0;j<x.length();j++)
			{
				if(str2.charAt(i)==x.charAt(j))
				{
					a=str2.charAt(i)-32;
					status=false;
					System.out.print((char)a);
				}
			}
			if(status==true)
			System.out.print(str2.charAt(i));
		}
		
	}
}