package return_keyword;

public class Method8 
{
	public static void main(String[] args) 
	{
		Method8 l1=new Method8();
		Method8 l2=l1.test();
		System.out.println(l2);
	}
	public Method8 test()
	{
		Method8 l1=new Method8();
		return l1;
	}

}
//Output is memory address
