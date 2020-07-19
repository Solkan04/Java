package protected_packageA;

import protected_packageB.ProtectedDemo4B;

//Different package non-sub class
public class ProtectedDemo4A 
{
	public static void main(String[] args) 
	{
		ProtectedDemo4B p=new ProtectedDemo4B();
		//p.test();//error
		//System.out.println(p.i);//error
	}
}
