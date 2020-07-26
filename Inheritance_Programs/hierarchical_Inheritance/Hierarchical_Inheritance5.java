package hierarchical_Inheritance;
//Hierarchical inheritance without parent having parameterized constructor
class Parent4
{
	Parent4()
	{
		System.out.println("Parent4 constructor");
	}
}
class Child6 extends Parent4
{
	Child6()
	{
		super();
		System.out.println("Child6 constructor");
	}
}
class Child7 extends Parent4
{
	Child7()
	{
		super();
		System.out.println("Child7 constructor");
	}
}
public class Hierarchical_Inheritance5
{
	public static void main(String[] args) 
	{
		Child6 ch6=new Child6();
		Child7 ch7=new Child7();	
	}
}

