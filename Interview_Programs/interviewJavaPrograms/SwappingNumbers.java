package interviewJavaPrograms;

public class SwappingNumbers 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("Before a value is : "+a);
		System.out.println("Before b value is : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After a value is : "+a);
		System.out.println("After b value is : "+b);
	}

}
