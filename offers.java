import java.util.*;
class offers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,sum=0,least,i;
		double offer;
		System.out.println("enter no of items:");
		n=s.nextInt();
		System.out.println("enter prices of each items:");
		int a[] =new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		least=a[0];
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(a[i]<least)
				least=a[i];
		}
		offer=sum*0.2;
		if(offer>least)
		{
			System.out.println("offer1 is better");
		}
		else
		{
			System.out.println("offer2 is better");
		}

	}
}
		