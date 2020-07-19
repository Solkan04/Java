package inheritance;

class Parent5
{
	Parent5()
	{
		System.out.println("Parent5 default constructor");
	}
	
	Parent5(String sName)
	{
		System.out.println("Parent5 constructor with 1 String");
	}
}

class Child6 extends Parent5
{
	
	Child6()
	{
		super();
		System.out.println("Child6 default constructor");
	}
	
	Child6(String city)
	{
		this();
		System.out.println("Child6 constructor with 1 string");
	}
}

class Child7 extends Parent5
{
	Child7()
	{
		super();
		System.out.println("Child7 default constructor");
	}
}
public class HierarchialInheritance {
	public static void main(String[] args) {
		Child6 ch6=new Child6();
		Child7 ch7=new Child7();
	}
}