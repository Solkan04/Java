package private_packageA;
//different package sub class
import private_packageB.PrivateDemo3B;
public class PrivateDemo3A extends PrivateDemo3B
{
	public static void main(String[] args) 
	{
		PrivateDemo3A pd=new PrivateDemo3A();
		//System.out.println(pd.i);
		//pd.test();
	}
}
//Private modifier is not accessible in different package sub class
