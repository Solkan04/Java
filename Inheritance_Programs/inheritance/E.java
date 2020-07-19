package inheritance;

class Sample4
{
	static int i=10;
}
public class E extends Sample4
{
	public static void main(String[] args) 
	{
		System.out.println(E.i);//Compiler automatically converts from (E.i) to (Sample4.i)
	}
}
//If we access static member in a child class then a conversion takes place to call parent class
//member giving us a feel of inheritance. But static members are never inherited