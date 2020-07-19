package return_keyword;
class F
{
	public int test()
	{
		int i=10;
		return i;
	}
}
public class Method5 
{
	public static void main(String[] args) 
	{
		F f=new F();
		int j=f.test();
		System.out.println(j);
	}
}
