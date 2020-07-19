package superkeyword_demo;
//Using both super & this keyword in different constructors
class Parent8
{
	Parent8(int i)
	{
		System.out.println(i);
	}
}
class Child8 extends Parent8
{
	Child8()
	{
		this(50);
		System.out.println("Child class default constructor");
	}
	Child8(int i)
	{
		super(100);
		System.out.println(i);
	}
}
public class Superkeyword8 
{
	public static void main(String[] args) 
	{
		new Child8();
	}
}
