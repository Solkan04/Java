package default_packageA;
//Same class
public class DefaultDemo 
{
	int i=10;
	void test()
	{
		System.out.println("Default accessible in Same class");
	}
	public static void main(String[] args) 
	{
		DefaultDemo d=new DefaultDemo();
		System.out.println(d.i);
		d.test();
	}
}
