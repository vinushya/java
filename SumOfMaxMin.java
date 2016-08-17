class SumOfMaxMin
{
	public static void main(String[] arg)
	{
		Integer[] num;
		Integer max=0,min=0,sum=0,tmp=0,n;
		System.out.print("Enter the size of array:");
		n=new java.util.Scanner(System.in).nextInt();
		num=new Integer[n];
		System.out.println("Enter"+" "+n+" "+"number:");
		for(int i=0;i<n;i++)
		num[i]=new java.util.Scanner(System.in).nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(num[i]<num[j])
				{
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
					max=num[0];
					
				}
			}
			
		}
		
		System.out.println("max:"+max);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(num[i]>num[j])
				{
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
					min=num[0];
					
				}
			}
		}
		System.out.println("min:"+min);
		sum=max+min;
		System.out.println("max+min:"+max+"+"+min);
		System.out.println("sum:"+sum);	
	}
}