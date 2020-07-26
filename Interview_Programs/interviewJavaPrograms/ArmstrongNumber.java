package interviewJavaPrograms;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		isArmstrong(371);
		
	}
	public static void isArmstrong(int num)
	{
		int cube=0;
		int temp;
		int rem;
		
		temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
			if(temp==cube)
			{
				System.out.println("Given number is armstrong");
			}
			else
			{
				System.out.println("Given number is not armstrong");
			}
		
	}

}
