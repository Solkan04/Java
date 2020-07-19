package interface_demo;

interface Parent
{
	static void print()
	{
		System.out.println("Static method in interface");
	}
}
public class InterfaceDemo14 implements Parent
{
	public static void main(String[] args) 
	{
		//InterfaceDemo14 ID14=new InterfaceDemo14();
		//ID14.print();
		System.out.println("#####################");
		Parent.print();
	}
}
//Static methods in interface has to be accessed in static way.

