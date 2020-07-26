package simple_Inheritance;
//simple inheritance with non-static method
class Parent2
{
	public void test()//non-static method
	{
		System.out.println("test");
	}
}
public class Inheritance2 extends Parent2
{
	public static void main(String[] args) 
	{
		Inheritance2 obj=new Inheritance2();
		obj.test();//calling parent class method
	}
}
