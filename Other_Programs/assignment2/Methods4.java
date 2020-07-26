package assignment2;
//Print Square
class Sample5
{
	void displaystars(int rows)
	{
		for(int i=rows-1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
public class Methods4 
{
	public static void main(String[] args) 
	{
		Sample5 stars=new Sample5();
		stars.displaystars(2);
	}
}
