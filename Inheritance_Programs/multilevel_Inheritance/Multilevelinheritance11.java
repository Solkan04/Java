package multilevel_Inheritance;
//Multilevel inheritance with parameterized constructor in Parent class
class Grandfather11
{
	Grandfather11()
	{
		System.out.println("Parent class with default constructor");
	}
	Grandfather11(Double Salary)
	{
		System.out.println("Parent[Father class] with double parameter");
	}
}
class Father11 extends Grandfather11
{
	Father11()
	{
		System.out.println("Father11 class with default constructor");
	}
	Father11(Double Salary)
	{
		System.out.println("Parent[Father class] with double parameter");
	}
	Father11(String name,int age)
	{
		System.out.println("Parent[Father class] with three parameter");
	}
}
class Child11 extends Father11
{
	Child11(String name, int age, String City)
	{
		super(name,age);
		System.out.println("Child class with Parameterized constructor");
	}
	Child11(Double Salary)
	{
		super(Salary);
		System.out.println("Child class with double parameter");
	}
	Child11()
	{
		System.out.println("CHild class with default constructor");
	}
}
public class Multilevelinheritance11 
{
	public static void main(String[] args) 
	{
		new Child11("Mahesh",25,"Begaluru");
		new Child11(10000.00);
		new Child11();
	}
}
