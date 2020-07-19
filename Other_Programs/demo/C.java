package demo;

public class C 
{
	public static void main(String[] args) 
	{
		 for(int i=1;i<=4;i++)
		{
			System.out.println();
			for(int j=1;j<=4;j++)
			{
				if(i==1 && j==2 || i==1 && j==3 || i==1 && j==4 || i==2 && j==3 || i==3 && j==4)
				{
					System.out.println();
				}
				else
				{
					System.out.print(+i);
				}
			}
		}
	}
}