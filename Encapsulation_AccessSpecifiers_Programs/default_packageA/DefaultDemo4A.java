package default_packageA;
import default_packageB.DefaultDemo4B;
//different package non-sub class
public class DefaultDemo4A 
{
	public static void main(String[] args) 
	{
		DefaultDemo4B d=new DefaultDemo4B();
		//System.out.println(d.i);//error
		//d.test();//error
	}
}
//Default modifier is not accessible in different package non-sub class
