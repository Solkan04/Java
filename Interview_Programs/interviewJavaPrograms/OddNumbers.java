package interviewJavaPrograms;

public class OddNumbers 
{
	public static void main(String[] args) 
	{
		int limit=10;
		System.out.println("Printing odd numbers from 1 to :"+limit);
		for(int i=0;i<=limit;i++)
		{
			if(i % 2==1)
			{
			System.out.print(i+" ");
			}
		}
	}
}
