import java.io.*;
import java.util.*;
class Medicine
{
	String c_name;
	void get_Name()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Company name of Medicine ::");
		c_name=sc.next();
	}
}
class Dealer extends Medicine
{
	String p_name;
	float price;
	void get_Details()
	{
		Scannner sc1= new Scanner(System.in);
		get_Name();
		System.out.print("Enter the Product Name ::");
		p_name=sc1.next();
		System.out.print("Enter the base price ::");
		price=sc1.nextFloat();
	}
}
class Retailer extends Dealer
{
	
		float s_price;
		get_Details();
		void print_Det()
		{
			s_price=0.015*price;
			System.out.println("The Sale Price of the Medicine is :: "+s_price);
		}	
}

class Med
{
	public static void main(String ar[])
	{
		Retailer r1 = new Retailer();
		r1.print_Det();
	}
}
		