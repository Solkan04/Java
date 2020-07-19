package inheritance;

class Parent7
{
	void displayName(String name)
	{
		System.out.println("Super class:- NAme is :"+name);
	}
}

class Child9 extends Parent7
{
	void displayName(String name)
	{
		System.out.println("Child class:- NAme is :"+name);
	}
}
public class MethodOverriding_Inheritance1 {
	public static void main(String[] args) {
		Child9 ch9=new Child9();
		ch9.displayName("Modi");
	}
}