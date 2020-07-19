package constructor_demo;

public class Constructoroverloading 
{
	int rollnumber;
	String name;
	int age;
	Constructoroverloading(int i, String n)
	{
		rollnumber=i;
		name=n;
		System.out.println("Rollnumber: " +rollnumber);
		System.out.println("Name: " +name);
	}
	Constructoroverloading(int i, String n, int a)
	{
		rollnumber=i;
		name=n;
		age=a;
		System.out.println("Rollnumber: " +rollnumber);
		System.out.println("Name: " +name);
		System.out.println("Age is: " +age);
	}
	public static void main(String[] args) 
	{
		new Constructoroverloading(45, "Mahesh");
		System.out.println("******************");
		new Constructoroverloading(45, "Mahesh", 25);
	}
}
