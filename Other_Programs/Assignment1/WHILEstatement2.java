package Assignment1;
//display the odd numbers from 151 to 131
public class WHILEstatement2 
{
	public static void main(String[] args) 
	{
		int i=151;
		while(i>=131)
		{
			if(i%2!=0)
			{
				System.out.println("" +i);
				i-=2;
			}
		}
	}
}
