package inheritance;
class Sample//Parent class
{
	int i=10;
	static int j=20;
}
public class A extends Sample
{
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.i);
	}
}
//In inheritance non-static members of parent/super class will get inherited to the child/sub class object
