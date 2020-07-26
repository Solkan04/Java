package interviewJavaPrograms;

//Question--Is it necessary that each try block must be followed by a catch block?
//Answer----It is not necessary that each try block must be followed by a catch block.
//It should be followed by either a catch block OR a finally block.
public class ExceptionHandlingDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=1;
			System.out.println(a/0);
		}
		finally
		{
			System.out.println("Rest of the code");
		}
		
	}

}
