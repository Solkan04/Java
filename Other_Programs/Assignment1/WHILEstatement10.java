package Assignment1;
//print 5X2 
public class WHILEstatement10 
{
	public static void main(String[] args) 
	{
		String s="*";
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=2)
			{
				System.out.print("" +s);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
