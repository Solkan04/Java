package inheritance;
class Parent1
{
	int age;
	String sName;
	void displayName()
	{
		System.out.println("The name is : Modi");
	}
}
class Child1 extends Parent1
{
	String sCity;
	void showAge()
	{
		System.out.println("The age is : 25");
	}
}
public class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		Child1 ch1=new Child1();
		System.out.println(ch1.age=25);
		System.out.println(ch1.sName="Kalam");
		ch1.displayName();
		//===========================
		System.out.println(ch1.sCity="Raichur");
		ch1.showAge();
	}
}
