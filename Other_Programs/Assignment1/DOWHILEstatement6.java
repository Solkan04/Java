package Assignment1;
//display the numbers from 1 to 100 incremented by 6
public class DOWHILEstatement6 
{
	public static void main(String[] args) 
	{
		int i=0;
		do
		{
			if(i%6==0)
			{
				System.out.println("" +i);
				i+=6;
			}
		}
		while(i<=100);
	}
}
