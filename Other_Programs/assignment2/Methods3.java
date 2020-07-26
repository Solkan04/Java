package assignment2;
//print rectangle
class Sample4
{
	void displaystars(int rows)
	{
		for(int i=rows-1;i<=2;i++)
		{
			for(int j=1;j<=6;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
public class Methods3 
{
	public static void main(String[] args) 
	{
		Sample4 stars=new Sample4();
		stars.displaystars(2);
	}
}
