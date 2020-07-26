package Assignment1;
//display the numbers from 1 to 100 incremented by 6

public class FORstatement6 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=100; i+=6)
		{
			if(i%6==0)
			{
				System.out.println("The value of I: " +i);
			}
		}
	}
}
