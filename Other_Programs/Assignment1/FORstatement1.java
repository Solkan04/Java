package Assignment1;
//Display the even numbers from 100 to 80

public class FORstatement1 
{
	public static void main(String[] args) 
	{
		for(int i=100;i>=80;i-=2)
		{
			if(i%2==0)
			{
				System.out.println("I value: " +i);
				//i=i-100;
			}
		}
	}
}
