package methods_demo;
//Display Vowels A E I O U
class Vowels
{
	void display1()
	{
		System.out.println("A");
		display2();
	}
	void display2()
	{
		System.out.println("E");
		display3();
	}
	void display3()
	{
		System.out.println("I");
		display4();
	}
	void display4()
	{
		System.out.println("O");
		display5();
	}
	void display5()
	{
		System.out.println("U");
	}
}
public class Method4 
{
	public static void main(String[] args) 
	{
		Vowels v=new Vowels();
		v.display1();
	}
}
