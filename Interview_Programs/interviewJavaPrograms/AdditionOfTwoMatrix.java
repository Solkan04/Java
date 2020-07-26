package interviewJavaPrograms;

public class AdditionOfTwoMatrix 
{
	public static void main(String[] args) 
	{
		int a[][]={{1,2},{4,5}};
		int b[][]={{1,2},{4,5}};
		int add[][]=new int[2][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+add[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
