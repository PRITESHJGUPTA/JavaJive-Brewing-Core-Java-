import java.util.*;

class Floyd
{
	public static void main(String ar[])
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			if(i%2!=0)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
				