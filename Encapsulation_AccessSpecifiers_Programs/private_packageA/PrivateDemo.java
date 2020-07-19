package private_packageA;
//Same Class

public class PrivateDemo 
{
	private int i=10;
	private void test()
	{
		System.out.println("Private accessible in Same class");
	}
	public static void main(String[] args) 
	{
		PrivateDemo p=new PrivateDemo();
		System.out.println(p.i);
		p.test();
	}
}

