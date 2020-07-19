package private_packageA;
//Same package non-sub class
class PrivateDemo2B
{
	private int i=20;
	private void test()
	{
		System.out.println("Private modifier in same package non-sub class");
	}
}
public class PrivateDemo2A 
{
	public static void main(String[] args) 
	{
		PrivateDemo2B pd=new PrivateDemo2B();
		//System.out.println(pd.i);//error
		//pd.test();//error
	}
}
//private modifier is not accessible in same package non-sub class
