package public_packageA;
import public_packageB.PublicDemo3B;
//Different package sub class
public class PublicDemo3A extends PublicDemo3B
{
	public static void main(String[] args) 
	{
		PublicDemo3A p=new PublicDemo3A();
		System.out.println(p.i);
		p.test();
	}
}
