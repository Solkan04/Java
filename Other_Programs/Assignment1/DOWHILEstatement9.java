package Assignment1;
//print right angle triangle in reverse order

public class DOWHILEstatement9 
{
	public static void main(String[] args) 
	{
		String s="#";
		int i=1;
		do
		{
			int j=5;
			do
			{
				System.out.print("" +s);
				j--;
			}
			while(j>=i);
			System.out.println();
			i++;
		}
		while(i<=5);
	}

}
