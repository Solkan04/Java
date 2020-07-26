package interviewJavaPrograms;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,count=10,c;
		System.out.print(" "+a+" "+b);//Printing 0 and 1 initially
		for(int i=0;i<count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
	}

}
