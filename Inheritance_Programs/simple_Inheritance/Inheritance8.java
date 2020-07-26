package simple_Inheritance;
//simple inheritance with non-static members
class Parent8
{
	int age;
	String sName;
	public void displayname()
	{
		System.out.println("MY name is Mahesh");
	}
}
class Child8 extends Parent8
{
	String sCity;
	public void cityname()
	{
		System.out.println("City is Bengaluru");
	}
}
public class Inheritance8 
{
	public static void main(String[] args) 
	{
		Child8 ch8=new Child8();
		System.out.println(ch8.age=25);
		System.out.println(ch8.sName="Mahesh");
		ch8.displayname();
		System.out.println(ch8.sCity="Bengaluru");
		ch8.cityname();
	}
}
