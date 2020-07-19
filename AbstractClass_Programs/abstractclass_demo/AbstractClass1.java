package abstractclass_demo;

abstract class Parent1 
{
	String FN;
	static int age;
	abstract void displayName();
	abstract void showAge();
	Parent1() 
	{
		System.out.println("Parent1 abstract class Default constructor...!!!");
	}
}
class Child1 extends Parent1 
{
	void displayName() 
	{
		System.out.println("The name is Modi");
	}
	void showAge() 
	{
		System.out.println("The age is 65");
	}
}
public class AbstractClass1 
{
	public static void main(String[] args) 
	{
		Child1 ch1 = new Child1();
		ch1.displayName();
		ch1.showAge();
		System.out.println(ch1.FN = "Bhagath");
		System.out.println(Parent1.age = 23);
	}
}