package return_keyword;
class Sample1
{
	int addition(int x,int y)
	{
		int result=x+y;
		return result;
	}
	int multiplication(int m,int n)
	{
		int result=m*n;
		return result;
	}
}
public class Method9 
{
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		int add=s1.addition(2,4);
		System.out.println("Addition: " +add);
		int mult=s1.multiplication(add, 10);
		System.out.println("Multiplication: " +mult);
	}
}
