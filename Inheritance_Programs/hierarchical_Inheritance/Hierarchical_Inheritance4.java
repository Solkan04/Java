package hierarchical_Inheritance;
//Hierarchical inheritance with parent having parameterized constructor
class Parent3
{
	String sName;
	int age;
	Parent3(String name, int age)
	{
		sName=name;
		this.age=age;
		System.out.println("Parent2 constructor with name & age");
	}
	Parent3(double salary)
	{
		System.out.println("Parent2 class Salary");
	}
}
class Child4 extends Parent3
{
	String city;
	Child4(String name, int age, String city)
	{
		super(name, age);
		this.city=city;
		System.out.println("Child2 constructor with NAme & age");
	}
}
class Child5 extends Parent3
{
	Child5(double sal)
	{
		super(sal);
		System.out.println("Child2 with salary");
	}
}
public class Hierarchical_Inheritance4 
{
	public static void main(String[] args) 
	{
		Child4 ch4=new Child4("Narendra", 60, "India");
		Child5 ch5=new Child5(999.99);	
	}
}
