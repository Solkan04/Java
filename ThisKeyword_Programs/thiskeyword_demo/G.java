package thiskeyword_demo;

public class G 
{
	int i=10;
	public static void main(String[] args) 
	{
		G.test();
	}
	public static void test()
	{
		//System.out.println(this.i); "this" keyword cannot be used in a static method
	}
}
