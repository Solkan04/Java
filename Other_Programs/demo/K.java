package demo;

public class K 
{
	public static void main(String[] args) 
	{
		String s="#";
		int i=5;
		do
		{
			int j=1;
			do
			{
				System.out.print(" " +s);
				j++;
			}
			while(j<=i);
			System.out.println();
			i--;
		}
		while(i>=1);
	}
}
