package Assignment1;
//print right angle triangle pattern
public class WHILEstatement8 
{
	public static void main(String[] args) 
	{
		String s="#";
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("" +s);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
