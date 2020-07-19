package public_packageA;
//Same class
public class PublicDemo 
{
	public int i=10;
	public void test()
	{
		System.out.println("Public access specifier in Same class");
	}
	public static void main(String[] args) 
	{
		PublicDemo p=new PublicDemo();
		System.out.println(p.i);
		p.test();
	}
}
