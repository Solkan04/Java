package interviewJavaPrograms;

public class PrimeNumberOrNot 
{
	public static void main(String[] args) 
	{
		int num=4;
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" Number is prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
			
		}
		
	}

}
