package Assignment1;
//print square using WHILE
public class WHILEstatement7 
{
	public static void main(String[] args) 
	{
		String s="*";
		int i=1;
		while(i<=4)
		{
			int j=1;
			while(j<=4)
			{
				System.out.print("" +s);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
