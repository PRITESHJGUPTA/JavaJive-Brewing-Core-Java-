import java.util.*;

class SavingAccount
{
	Scanner sc=new Scanner(System.in);	
	static int accno=1;
	String accname;
	float balance=0;
	int num;
	SavingAccount()
	{
		System.out.println("\t\t:: WELCOME ::");
		System.out.println("Your Account Number is :: "+accno);
		num=accno;
		System.out.print("Enter the name of Account Holder :: ");
		accname=sc.next();
		System.out.println("Your Current Balance is :: "+balance);
		accno++;
	}
	void depositAmount(float amt)
	{
		balance+=(float)amt;
		System.out.println("Your Amount has been Updated to :: "+balance);	
	}
	void withdrawAmount(float amt)
	{
		balance-=(float)amt;
		System.out.println("Your Amount has been Updated to :: "+balance);
	}
	void displayDetails()
	{
		System.out.println("\t\t _______________________________________________");
		System.out.println("\t\t|\tACCOUNT NUMBER  \t|\t"+num+"\t|");
		System.out.println("\t\t|\tNAME               \t|\t"+accname+"\t|");
		System.out.println("\t\t|\tCURRENT BALANCE  \t|\t"+balance+"\t|");
		System.out.println("\t\t|_______________________________|_______________|");
	} 
}
class Bank
{
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,i;
		i=1;
		int num;
		float amt;
		SavingAccount s[]=new SavingAccount[10];
		do
		{
			System.out.println("Following are the choices to perform :: \n1.New Account\n2.Deposit Amount\n3.Withdraw Amount\n4.Display Details");
			System.out.print("Enter your choice :: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					{
						s[i]=new SavingAccount();
						i++;
						break;
					}
				case 2:
					{
						System.out.print("Enter your Account Number :: ");
						num=sc.nextInt();
						System.out.print("\nEnter the Amount to Deposit :: ");
						amt=sc.nextFloat();
						s[num].depositAmount(amt);
						num=0;
						break;
					}
				case 3:
					{
						System.out.print("Enter your Account Number :: ");
						num=sc.nextInt();
						System.out.print("\nEnter the Amount to Withdraw :: ");
						amt=sc.nextFloat();
						s[num].withdrawAmount(amt);
						num=0;
						break;
					}
				case 4:
					{
						System.out.print("Enter your Account Number :: ");
						num=sc.nextInt();
						s[num].displayDetails();
						break;
					}
				default:
					{
						System.out.println("INVALID CHOICES GIVEN!!");
						break;
					}
			}
		}
		while(true);	
		
	}

}			