package private_packageA;
//Same Package Sub class
class PrivateDemo1B
{
	private int i=10;
	private void test()
	{
		System.out.println("Private modifier in sub class");
	}
}
public class PrivateDemo1A extends PrivateDemo1B
{
	public static void main(String[] args)
	{
		PrivateDemo1A pd=new PrivateDemo1A();
		//System.out.println(pd.i);//error
		//pd.test();////error
	}
}
//private modifier is not accessible in same package subclass
