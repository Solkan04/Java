package assignment4;
//Hybrid inheritance with parent having parameterized constructor
class Parent6
{
	String sName;
	int age;
	Parent6(String name, int age)
	{
		sName=name;
		this.age=age;
		System.out.println("Parent6 constructor with name & age");
	}
	Parent6(double salary)
	{
		System.out.println("Parent6 with Salary");
	}
	Parent6()
	{
		System.out.println("Parent6 default constructor");
	}
}
class Child10 extends Parent6
{
	String city;
	Child10(String name, int age, String city)
	{
		super(name, age);
		this.city=city;
		System.out.println("Child10 constructor with NAme & age");
	}
	Child10(double sal)
	{
		super(sal);
		System.out.println("Child10 with salary");
	}
	Child10()
	{
		System.out.println("Child10 default constructor");
	}
}
class Child11 extends Parent6
{
	Child11()
	{
		super();
		System.out.println("Child11 default constructor");
	}
}
class Child12 extends Child10
{
	Child12()
	{
		super();
		System.out.println("Child12 default constructor");
	}
}
public class Hybridinheritance
{
	public static void main(String[] args) 
	{
		Child10 ch2=new Child10("Narendra", 60, "India");
		Child10 ch3=new Child10(999.99);	
		Child11 ch4=new Child11();
		Child12 ch5=new Child12();
	}
}