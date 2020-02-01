import java.util.Scanner;
class bill
{
	public static void main(String args[])
	{
		int billno,date;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter billno:");
		billno=sc.nextInt();
		System.out.println("enter date:");
		date=sc.nextInt();
		if((date>0&&date<31)&&(billno%100==date || billno%10==date || billno%date==0))
		{
			System.out.println("you are lucky person");
		}
		else
		{
			System.out.println("You are not lucky person");
		}
	}
}
		