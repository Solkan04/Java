package inheritance;

class Sample1
{
	int i;//non-static member, default value is zero
}
public class B extends Sample1
{
	int j=10;
	public static void main(String[] args) 
	{
		B b=new B();
		System.out.println(b.i);//inherited member here is "i"
		System.out.println(b.j);//"j" is not inherited
	}
}
