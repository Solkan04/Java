package demo;

public class D 
{
	public static void main(String[] args) 
	{
		String s="#";
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" " +s);
			}
			System.out.println("");
		}
	}
}
