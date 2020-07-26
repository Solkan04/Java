package multilevel_Inheritance;
//Multilevel inheritance with parameterized constructor in child class
class Grandfather9
{
	public void test()
	{
		System.out.println("test");
	}
}
class Father9 extends Grandfather9
{
	public void test1()
	{
		System.out.println("test1");
	}
}
class ChildMI9 extends Father9
{
	ChildMI9(String Name)
	{
		System.out.println("the name is: " +Name);
	}
}
public class Multilevelinheritance9 
{
	public static void main(String[] args) 
	{
		ChildMI9 ch9=new ChildMI9("Mahesh");
		ch9.test();
		ch9.test1();
	}
}
