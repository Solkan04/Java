package Assignment1;
//print reverse right angle triangle
public class WHILEstatement9 
{
	public static void main(String[] args) 
	{
		String s="*";
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("" +s);
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
