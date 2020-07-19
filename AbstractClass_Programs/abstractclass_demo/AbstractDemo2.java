package abstractclass_demo;
//Abstract class can have Non-static & static members, Abstract methods & concrete methods, and constructors....
abstract class Parent
{
	String FN;//non-static variable
	static int age;//static variable
	abstract void displayname();//abstract method
	void displaycity()//concrete method
	{
		System.out.println("The city id Bengaluru");
	}
	Parent()//default constructor
	{
		System.out.println("Parent class default constructor");
	}
}
class Child extends Parent
{
	void displayname()
	{
		System.out.println("The name is Modi");
	}
}
public class AbstractDemo2 
{
	public static void main(String[] args) 
	{
		Child ch=new Child();
		System.out.println(ch.FN="Narendra");
		ch.displaycity();
		ch.displayname();
		System.out.println(Parent.age=65);
	}

}
