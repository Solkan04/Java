package interviewJavaPrograms;

public class FindSmallestAndLargestNumbers 
{
	public static void main(String[] args) 
	{
		int [] numbers={10,5,-2,50,100};
		int largest =numbers[0];
		int smallest =numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		System.out.println("Largest number is :  "+largest);
		System.out.println("Smallest Number is : "+smallest);
		
	}

}
