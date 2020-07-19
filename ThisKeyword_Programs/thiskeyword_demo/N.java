package thiskeyword_demo;

public class N
{
	int i=10;//non-static variable
	N()//constructor
	{
		System.out.println("O");
	}
	public static void main(String[] args) 
	{
		new N().test();//here "new N()" is the object created & "new N().test()" will call the non-static method.
		System.out.println("main");
	}
	public void test()//non-static method
	{
		System.out.println(this.i);//here we've not created any reference to the object[new N()]
		//but as we've created the object, the compiler will automatically have "this" keyword as a reference to the object created
	}
}
