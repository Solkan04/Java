package return_keyword;
class E
{
	public void test()
	{
		int i=10;
		//return i;
	}
}
public class Method4 
{
	public static void main(String[] args) 
	{
		E e=new E();
		e.test();
	}
}
//method cannot be off the type void while returning the value
