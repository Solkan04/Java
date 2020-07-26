package Assignment1;
//display the numbers from 1 to 100 incremented by 6 using WHILE
public class WHILEstatement3 
{
	public static void main(String[] args) 
	{
		int i=0;
		while(i<=100)
		{
			if(i%6==0)
			{
				System.out.println("" +i);
				i+=6;
			}
		}
	}
}
