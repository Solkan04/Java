package protected_packageA;

import protected_packageB.ProtectedDemo3B;

//Different package sub class
public class ProtectedDemo3A extends ProtectedDemo3B
{
	public static void main(String[] args) 
	{
		ProtectedDemo3A p=new ProtectedDemo3A();
		p.test();
		System.out.println(p.i);
	}
}
