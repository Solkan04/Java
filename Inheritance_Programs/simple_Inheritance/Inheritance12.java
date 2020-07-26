package simple_Inheritance;
//Simple inheritance with Parameterized constructor in Parent class
class Parent12
{
	String sName;
	int age;
	Parent12(String Name, int age)
	{
		sName=Name;
		this.age=age;
		System.out.println("Parent class with String & int parameters");
	}
	Parent12(double salary)
	{
		System.out.println("Parent class with double prameter");
	}
}
class Child12 extends Parent12
{
	String city;
	Child12(String Name,int age,String city)
	{
		super(Name,age);
		System.out.println("Child class with three parameters");
	}
	Child12(double salary)
	{
		super(salary);
		System.out.println("Child class with double parameter");
	}
}
public class Inheritance12 
{
	public static void main(String[] args) 
	{
		new Child12("Mahesh",25,"Bengaluru");
		new Child12(120000.00);
	}
}
//If we create a constructor in a parent class then the same type of constructor has to be implemented in child class