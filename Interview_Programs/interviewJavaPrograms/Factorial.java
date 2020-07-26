package interviewJavaPrograms;

 class Factorial 
{
	public static void main(String[] args) 
	{
		 int fact=1,count=5;
		for(int i=1;i<=count;i++)
		{
			fact=fact*i;
			System.out.print("Factorial Number is : "+fact);
		}
		//System.out.print("Factorial Number is : "+fact);
	}

}
