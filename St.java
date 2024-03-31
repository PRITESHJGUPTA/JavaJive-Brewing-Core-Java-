import java.util.*;

class cmt
{
	int new1=0;
	static int num=0;
	void  show()
	{
		System.out.println("The Non Static member = "+new1);
		new1++;
		System.out.println("The Static member = "+num);
		num++;
	}
	static void stFun()
	{
		System.out.println("The static function is now accesed from another class");
	}
}

class St
{
	static void smstfun()
	{
		System.out.println("The Static function is now accesed from the same class");
	}
	public static void main(String ar[])
	{
		cmt c1=new cmt();
		c1.show();
		cmt c2=new cmt();
		c2.show();
		cmt.stFun();
		smstfun();
	}
}