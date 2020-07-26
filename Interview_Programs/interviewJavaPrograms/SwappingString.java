package interviewJavaPrograms;

public class SwappingString 
{
	public static void main(String[] args) 
	{
		String a="Appa";
		String b="Amma";
		
		System.out.println("Before swapping a and b value is ");
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swapping a and b value is ");
		System.out.println(a);
		System.out.println(b);
		
	}

}
