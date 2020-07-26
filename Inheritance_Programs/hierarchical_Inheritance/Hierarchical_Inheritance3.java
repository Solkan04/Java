package hierarchical_Inheritance;
//Hierarchical inheritance with non-static method & non-static variable
class Parent2
{
	String name="Mahesh";
	public void displayname1()
	{
		System.out.println("Parent2");
	}
}
class Son2 extends Parent2
{
	int i=10;
	public void displayname2()
	{
		System.out.println("Son2");
	}
}
class Daughter2 extends Parent2
{
	int j=20;
	public void displayname3()
	{
		System.out.println("Daughter");
	}
}
public class Hierarchical_Inheritance3 
{
	public static void main(String[] args) 
	{
		Son2 s2=new Son2();
		System.out.println(s2.i);
		System.out.println(s2.name);
		s2.displayname2();
		s2.displayname1();
		System.out.println("##################");
		Daughter2 d2=new Daughter2();
		System.out.println(d2.j);
		System.out.println(d2.name);
		d2.displayname3();
		d2.displayname1();
	}
}
