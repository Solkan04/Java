package interviewJavaPrograms;

public class EvenNumbers 
{
	public static void main(String[] args) 
	{
		int limit = 10;
        System.out.println("Printing Even numbers between 1 and " + limit);
        for(int i=1; i <= limit; i++)
        {
			// if the number is divisible by 2 then it is even
		     if( i % 2 == 0)
	      {
			System.out.print(i + " ");
		  }
	    }	
     }
}
