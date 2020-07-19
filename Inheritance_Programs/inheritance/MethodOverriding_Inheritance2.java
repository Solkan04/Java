package inheritance;

class Parent8
{
	void displayName(String name)
	{
		System.out.println("Super class:- NAme is :"+name);
	}
}

class Child10 extends Parent8
{
	void displayName(String name)
	{
		super.displayName("Kalam");
		System.out.println("Child class:- NAme is :"+name);
	}
}
public class MethodOverriding_Inheritance2 {
	public static void main(String[] args) {
		Child10 ch10=new Child10();
		ch10.displayName("Modi");
	}
}