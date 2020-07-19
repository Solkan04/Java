package inheritance;
//Accessing both static & non-static members
class Sample7
{
	int i;
	static int j;
	public void test()
	{
		System.out.println("Test");
	}
	public static void test1()
	{
		System.out.println("test1");
	}
}
public class H extends Sample7
{
	int k=10;
	public void test2()
	{
		System.out.println("Test2");
	}
	public static void main(String[] args) 
	{
		H h=new H();
		System.out.println(h.i);
		System.out.println(H.j);//Compiler automatically converts "(H.j)" to "(Sample7.j)"
		h.test();
		H.test1();//Compiler automatically converts "H.test1()" to "Sample7.test()"
		System.out.println(h.k);
		h.test2();
	}
}
