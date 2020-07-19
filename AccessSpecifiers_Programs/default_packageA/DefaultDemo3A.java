package default_packageA;
//Different package Sub-class
import default_packageB.DefaultDemo3B;

public class DefaultDemo3A extends DefaultDemo3B
{
	public static void main(String[] args) 
	{
		DefaultDemo3A d=new DefaultDemo3A();
		//System.out.println(d.i);//error
		//d.test();//error
	}
}
//Default access modifier is not accessible in different package sub class
