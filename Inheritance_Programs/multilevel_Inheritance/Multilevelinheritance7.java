package multilevel_Inheritance;
//Multilevel inheritance with non-static members
class Grandfather7
{
	int age;
	public void showage()
	{
		System.out.println("The age is 25");
	}
}
class Father7 extends Grandfather7
{
	String Name;
	public void displayname()
	{
		System.out.println("The name is Mahesh");
	}
}
class Child7 extends Father7
{
	String City;
	public void displaycity()
	{
		System.out.println("The city is Bengaluru");
	}
}
public class Multilevelinheritance7 
{
	public static void main(String[] args) 
	{
		Child7 ch7=new Child7();
		System.out.println(ch7.age=25);
		ch7.showage();
		System.out.println(ch7.Name="Mahesh");
		ch7.displayname();
		System.out.println(ch7.City="Bengaluru");
		ch7.displaycity();
	}
}
