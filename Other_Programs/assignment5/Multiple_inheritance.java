package assignment5;
//Example for multiple inheritance using interfaces
interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class child implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
}
public class Multiple_inheritance 
{
	public static void main(String[] args) 
	{
		child ch=new child();
		ch.print();
		ch.show();
	}
}
