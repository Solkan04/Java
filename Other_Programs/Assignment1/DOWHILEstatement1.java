package Assignment1;
//Display even numbers from 100 to 80
public class DOWHILEstatement1 
{
	public static void main(String[] args) 
	{
		int i=100;
		do
		{
			if(i%2==0)
			{
				System.out.println("" +i);
				i-=2;
			}
		}
		while(i>=80);
	}
}
