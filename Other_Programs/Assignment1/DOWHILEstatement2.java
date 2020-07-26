package Assignment1;
//display odd numbers from 151 to 131 using dowhile
public class DOWHILEstatement2 
{
	public static void main(String[] args) 
	{
		int i=151;
		do
		{
			if(i%2!=0)
			{
				System.out.println("" +i);
				i-=2;
			}
		}
		while(i>=131);
	}
}
