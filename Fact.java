import java.util.*;

class Fact
{
	public static void main(String ar[])
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		num1=sc.nextInt();
		for(int i=num1-1;i>=1;i--)
		{
			num1=num1*i;
		}
		System.out.println("The factorial is :"+num1);
	}
}