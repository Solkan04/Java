package interviewJavaPrograms;

public class ReverseInteger 
{
	public static void usingInbuildFunction()
	{
		int num=12345;

		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
	public static void notUsingInbuildFunction()
	{
		int numm=56789;
		int rev=0;
		while(numm !=0)
		{
			rev=rev * 10 + numm % 10;
			numm= numm/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		usingInbuildFunction();
		notUsingInbuildFunction();
		
		
	}

}
