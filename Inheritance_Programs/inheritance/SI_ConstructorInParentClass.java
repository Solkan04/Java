package inheritance;
class Parent2
{
	String sName;
	int age;
	Parent2(String name, int age)
	{
		sName=name;
		this.age=age;
		System.out.println("Parent2 constructor with name & age");
	}
	Parent2(double salary)
	{
		System.out.println("Parent2 class Salary");
	}
}
class Child2 extends Parent2
{
	String city;
	Child2(String name, int age, String city)
	{
		super(name, age);
		this.city=city;
		System.out.println("Child2 constructor with NAme & age");
	}
	Child2(double sal)
	{
		super(sal);
		System.out.println("Child2 with salary");
	}
}
public class SI_ConstructorInParentClass {
	public static void main(String[] args) {
		new Child2("Narendra", 60, "India");
		new Child2(999.99);	
	}
}