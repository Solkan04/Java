package multilevelinheritance;
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
class Child9 extends Father9
{
	Child9(String Name)
	{
		System.out.println("the name is: " +Name);
	}
}
public class Multilevelinheritance9 
{
	public static void main(String[] args) 
	{
		Child9 ch9=new Child9("Mahesh");
		ch9.test();
		ch9.test1();
	}
}
