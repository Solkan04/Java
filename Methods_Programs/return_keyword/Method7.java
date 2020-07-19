package return_keyword;

public class Method7 
{
	int a=10;
	public static void main(String[] args) 
	{
		System.out.println("Main");
		Method7 j1=new Method7();
		int I=j1.test();
		System.out.println(I);
	}
	public int test()
	{
		Method7 j2=new Method7();
		return j2.a;
	}
}
