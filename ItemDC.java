import java.io.*;
import java.util.*;
class ItemDC
{
	//BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
	int itemno;
	String description;
	int currentstocklevel, minimumlevel;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.print("Enter the Item number :");
		itemno=sc.nextInt();
		System.out.print("Enter the description for the item :");
		description=sc.next();
		System.out.print("Enter the minimum levelstock :");
		minimumlevel=sc.nextInt();
		currentstocklevel=minimumlevel;
	}
	int recept(int qty)
	{
		currentstocklevel=currentstocklevel+qty;
		return currentstocklevel;					
	}
	int issue(int qty)
	{
		currentstocklevel=currentstocklevel-qty;
		return currentstocklevel;					
	}
	static void display()
	{	
		System.out.println("\tItemno"+"\tDescreption"+"\t\tcurrentstocklevel"+"\tminimumlevel");
	}
	
	public static void main(String ar[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		ItemDC i[]=new ItemDC[5];
		for(int j=0;j<5;j++)
			i[j]=new ItemDC();
		
		for(int j=0;j<5;j++)
			i[j].input();
		do
		{
		System.out.print("Following are the choices :\n1.recept\n2.issue\n3.Display\n");
		int ch,num1;
		System.out.print("Enter your choice :");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				{
					System.out.print("Enter the item number :");
					int num5;
					num5=sc.nextInt();
					
					System.out.print("Enter the stock value :");
					num1=sc.nextInt();
					i[num5+1].recept(num1);
					num1=0;
					break;
				}
			case 2:
				{
					System.out.print("Enter the item number :");
					int num10=0;
					num10=sc.nextInt();
					System.out.print("Enter the new stock value :");
					num1=sc.nextInt();
					i[num10+1].issue(num1);
					break;
				}
			case 3:
				{
					ItemDC.display();
					for(int j=0;j<5;j++)
					{
						System.out.println("\t"+i[j].itemno+"\t"+i[j].description+"\t\t\t"+i[j].currentstocklevel+"\t\t\t"+i[j].minimumlevel);
					}	
					break;
				}
			default:
				{
					break;
				}
		}
		}
		while(true);
	}
}