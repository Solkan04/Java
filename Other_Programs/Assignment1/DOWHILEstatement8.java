package Assignment1;
//Display right angle triangle
public class DOWHILEstatement8 
{
	public static void main(String[] args) 
	{
		String s="*";
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("" +s);
				j++;
			}
			while(j<=i);
			System.out.println();
			i++;
		}
		while(i<=5);
	}
}
