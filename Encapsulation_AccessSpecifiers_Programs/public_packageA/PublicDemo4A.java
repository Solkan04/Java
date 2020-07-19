package public_packageA;
import public_packageB.PublicDemo4B;

//Different package non-sub class
public class PublicDemo4A 
{
	public static void main(String[] args) 
	{
		PublicDemo4B d=new PublicDemo4B();
		System.out.println(d.i);
		d.test();
	}
}
