import java.util.*;
class offer
{
	public static void main(String args[])
	{
		int billno,date,least;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		int sum= a+b+c;
		least=Math.min(a,Math.min(b,c));
		if((sum*0.2)<least)
		{
			System.out.println("offer1");
		}
		else
		{
			System.out.println("offer2");
		}
	}
}
		