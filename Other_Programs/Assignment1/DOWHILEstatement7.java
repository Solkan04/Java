package Assignment1;
//display square pattern
public class DOWHILEstatement7 
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
				System.out.print(" " +s);
				j++;
			}
			while(j<=4);
			System.out.println("");
			i++;
		}
		while(i<=4);
	}
}
