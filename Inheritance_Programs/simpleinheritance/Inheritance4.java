package simpleinheritance;
//Simple inheritance with Static variable
class Parent4
{
	static int i=10;
}
public class Inheritance4 
{
	public static void main(String[] args) 
	{
		System.out.println(Parent4.i);
	}
}
//static members are never inherited
//If we access static member in a child class then a conversion takes place to call parent class member giving us a feel of inheritance