package multilevel_Inheritance;
//Multilevel inheritance with parent having more than one parameterized constructor
class Parent5
{
	String sName;
	int age;
	Parent5(String name, int age)
	{
		sName=name;
		this.age=age;
		System.out.println("PArent5 with 1 string & 1 int parameter");
	}
	Parent5(double salary)
	{
		System.out.println("Parent5 with double parameter");
	}
	Parent5()
	{
		System.out.println("Parent5 default constructor");
	}
}
class Child8 extends Parent5
{
	String city;
	Child8(String name, int age)
	{
		super(name,age);
		this.city=city;
		System.out.println("Child8 with 1 string & 1 int parameter");
	}
	Child8(double salary)
	{
		super(salary);
		System.out.println("Child8 with double parameter");
	}
	Child8()
	{	
		System.out.println("Child8 default constructor");
	}
}
class Child9 extends Child8
{
	Child9()
	{
		super();
		System.out.println("Child9 constructor");
	}
}
public class Multilevelinheritance13 
{
	public static void main(String[] args) 
	{
		Child9 ch9=new Child9();
		Child8 ch8=new Child8(9999.99);
		Child8 ch10=new Child8("Mahesh", 25);
	}
}
