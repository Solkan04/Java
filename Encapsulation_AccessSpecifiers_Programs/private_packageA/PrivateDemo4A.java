package private_packageA;
import private_packageB.PrivateDemo4B;

//different package non-sub class
public class PrivateDemo4A 
{
	public static void main(String[] args) 
	{
		PrivateDemo4B pd=new PrivateDemo4B();
		//System.out.println(pd.i);
		//pd.test();
	}
}
//private modifier is not accessible in different package non-sub class
