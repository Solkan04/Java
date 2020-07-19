package private_packageA;

class Constructor
{
	private Constructor()
	{
		System.out.println("Private Constructor");
	}
	void msg()
	{
		System.out.println("Hello Private Constructor");
	}
}
public class PrivateConstructor 
{
	public static void main(String[] args) 
	{
		//Constructor c=new Constructor();
	}
}
//if constructor is private the we cannot create instance of that class from outside the class.
