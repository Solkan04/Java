package demo;

public class J 
{
	public static void main(String[] args) 
	{
		int num=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(" " +num);
				j++;
			}
			num++;
			System.out.println();
			i++;
		}
		
	}
}
