import java.io.*;

class Addition
{
	public static void main(String ar[])throws IOException
	{
		float a,b,c;
		DataInputStream d1=new DataInputStream(System.in);
		System.out.print("Enter the number 1 :");
		a=Float.parseFloat(d1.readline());
		System.out.println("Enter the number 2 :");
		b=Float.parseFloat(d1.readline());
		c=a+b;
		System.out.println("The Addition is :"+c);
	}
}