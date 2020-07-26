package Assignment1;
//display odd numbers from 151 to 131
public class FORstatement2 
{
	public static void main(String[] args) 
	{
		for(int i=151; i>=131; i-=2)
		{
			if(i%2!=0)
			{
				System.out.println("I value: " +i);
			}
		}
	}
}
