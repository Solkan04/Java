package return_keyword;
public class Method6 
{
	static int i;
	public static void main(String[] args) 
	{
		Method6 k=new Method6();
		int J=k.test();
		System.out.println(J);
	}
	public int test()
	{
		return Method6.i;
	}
}
//if static variable is not initialized then its default value is Zero
