package return_keyword;
class Sample
{
	int addition()
	{
		int result=4+5;
		return result;
	}
	int multiplication()
	{
		int result=10*5;
		return result;
	}
}
public class Method1 
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		int add=s.addition();
		System.out.println("Addition: " +add);
		int mult=s.multiplication();
		System.out.println("Multiplication: " +mult);
	}
}
