package inheritance;

class Parent4
{
	Parent4()
	{
		System.out.println("Parent class default constructor");
	}
}
class Child4 extends Parent4
{
	String sName;
	Child4()
	{
		super();
		System.out.println("Child class Default constructor");
	}
	Child4(String name)
	{
		sName=name;
		System.out.println("Child4 class constructor with 1 String param");
	}
}
class Child5 extends Child4
{
	String city;
	Child5(String city)
	{
		super(city);
		this.city=city;
		System.out.println("Child5 class constructor");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Child5 c5=new Child5("Raichur");
		System.out.println(c5.sName="Kengeri");
		//==================
		System.out.println(c5.city="Mahesh");
	}
}