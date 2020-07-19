package demo;

interface Parent
{
	static void print()
	{
		System.out.println("Static method in interface");
	}
}
public class N implements Parent
{
	public static void main(String[] args) 
	{
		//N n=new N();
		//n.print();
		Parent.print();
	}
}
