package constructor_demo;

class Overloading
{
	Overloading()
	{
		System.out.println("");
	}
	Overloading(String Firstname)
	{
		System.out.println("Naveen");
	}
	Overloading(int age)
	{
		System.out.println(30);
	}
	Overloading(int salary, String company)
	{
		System.out.println("9999 , Cyberstar");
	}
	Overloading(String company, int salary)
	{
		System.out.println("HP, 8888");
	}
}
public class Constructoroverloading1 
{
	public static void main(String[] args) 
	{
		Overloading con1=new Overloading();
		Overloading con2=new Overloading("Naveen");
		Overloading con3=new Overloading(30);
		Overloading con4=new Overloading(9999, "Cyberstar");
		Overloading con5=new Overloading("HP", 8888);
	}
}
