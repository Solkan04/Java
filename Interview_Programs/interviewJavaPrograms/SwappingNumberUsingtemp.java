package interviewJavaPrograms;

public class SwappingNumberUsingtemp
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A values is "+a);
		System.out.println("B value is "+b);		
	}
}
