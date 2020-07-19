package hierarchicalinheritance;
//Hierarchical inheritance with non-static method
class Parent1
{
	public void displayname1()
	{
		System.out.println("Parent class non-static method");
	}
}
class Son1 extends Parent1
{
	public void displayname2()
	{
		System.out.println("Son class non-static method");
	}
}
class Daughter1 extends Parent1
{
	public void displayname3()
	{
		System.out.println("Daughter class non-static method");
	}
}
public class Hierarchicalinheritance1 
{
	public static void main(String[] args) 
	{
		Son1 s1=new Son1();
		s1.displayname1();
		s1.displayname2();
		Daughter1 d1=new Daughter1();
		d1.displayname1();
		d1.displayname3();
	}
}
