import java.util.*;

class EvenOdd
{
	public static boolean ev(long num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String a[])
	{
		long num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		num1=sc.nextLong();
		//boolean s1;
		
		System.out.println(ev(num1));
	}
}
		