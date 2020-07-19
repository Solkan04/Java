package return_keyword;
class B
{
	public void test()
	{
		System.out.println("A");
		return;
		//System.out.println("B");
	}
}
public class Method3 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.test();
	}
}
//After return keyword if we write some statements then all the statements after return keyword
//will not execute & are called unreachable code