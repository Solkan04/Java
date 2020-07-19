package thiskeyword_demo;
//using "this" keyword for both static & non-static method
public class K 
{
	public static void main(String[] args) 
	{
		K k=new K();
		k.test1();
	}
	public void test1()
	{
		System.out.println("test1");
		this.test2();//Static methods has to be accessed with a class name[K]
		//here we've not used class name as a reference to access static method hence we're getting a warning but still will get an output
	}
	public static void test2()
	{
		System.out.println("test2");
	}
}
