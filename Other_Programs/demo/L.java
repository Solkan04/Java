package demo;

public class L 
{
	public static void main(String[] args) 
	{
		int num=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(" " +num);
				j++;
			}
			while(j<=i);
			System.out.println();
			num++;
			i++;
		}
		while(i<=5);
	}
}
