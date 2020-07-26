package Assignment1;
//print 5*2
public class DOWHILEstatement10 
{
	public static void main(String[] args) 
	{
		String s="$";
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("" +s);
				j++;
			}
			while(j<=2);
			System.out.println("");
			i++;
		}
		while(i<=5);
	}
}
