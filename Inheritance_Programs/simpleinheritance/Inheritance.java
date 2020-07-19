package simpleinheritance;
//simple inheritance with non-static variable
class Parent
{
	int i=10;//non-static variable
}
public class Inheritance extends Parent
{
	public static void main(String[] args) 
	{
		Inheritance obj=new Inheritance();
		System.out.println(obj.i);
	}
}
