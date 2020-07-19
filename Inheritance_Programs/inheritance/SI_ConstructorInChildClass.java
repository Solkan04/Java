package inheritance;

class Parent3
{
	void display()
	{
		System.out.println("Parent class method");
	}
}
class Child3 extends Parent3
{
	Child3()
	{
		System.out.println("Child class Default constructor");
	}
	
	Child3(String sName)
	{
		System.out.println("Child constructor with String param");
	}
}
public class SI_ConstructorInChildClass {
	public static void main(String[] args) {
		Child3 ch1=new Child3();
		ch1.display();
		Child3 ch2=new Child3("Modi");
		ch2.display();
	}
}