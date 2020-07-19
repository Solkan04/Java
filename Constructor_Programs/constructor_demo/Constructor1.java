package constructor_demo;

public class Constructor1 
{
	Constructor1()
	{
		System.out.println("Mahesh");
		//return 30;[error]Constructor does not have a return type i.e; retun type of constructor is always void
	}
	public static void main(String[] args) 
	{
		new Constructor1();
	}
}
