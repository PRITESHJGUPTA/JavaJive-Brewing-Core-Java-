import java.util.*;

class Paise
{
	public static void main(String ar[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1 & num2");
		num1=sc.nextInt();	
		num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1+num2;
		System.out.println("After swap"+num1+""+num2+"");
				
		
	}
}