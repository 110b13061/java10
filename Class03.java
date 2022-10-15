package java10;

class Caa
{
	public int num1;
	public int num2;
	public Caa()	//(a)
	{
		num1=1;
		num2=1;
	}
	public Caa(int a,int b)	//(b)
	{
		num1=a;
		num2=b;
	}
	void show()
	{
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
class Cbb extends Caa
{
	public Cbb(int a,int b)	//(c)
	{
		super(a,b);
	}
	void set_num(int a,int b)
	{
		num1=a;
		num2=b;
	}
}
public class Class03
{
	public static void main(String[] args)	//(d)
	{
		Caa a=new Caa();
		Caa b=new Caa(0,0);
		Cbb c=new Cbb(5,10);
		a.show();
		b.show();
		c.show();
	}
}
