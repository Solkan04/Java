package simple_Inheritance;
//Simple Inheritance with parent having more than one parameterized constructor
class ParentSI1
{
	String sName;
	int age;
	ParentSI1(String name, int age)
	{
		sName=name;
		this.age=age;
		System.out.println("Parent2 constructor with name & age");
	}
	ParentSI1(double salary)
	{
		System.out.println("Parent2 class Salary");
	}
}
class Child extends ParentSI1
{
	String city;
	Child(String name, int age, String city)
	{
		super(name, age);
		this.city=city;
		System.out.println("Child2 constructor with NAme & age");
	}
	Child(double sal)
	{
		super(sal);
		System.out.println("Child2 with salary");
	}
}
public class Simpleinheritance
{
	public static void main(String[] args) 
	{
		Child ch2=new Child("Narendra", 60, "India");
		Child ch3=new Child(999.99);	
	}
}
