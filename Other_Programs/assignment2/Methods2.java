package assignment2;
//Print right angle triangle
class Sample2
{
	void displaystars(int rows)
	{
		for(int i=rows-1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("%");
			}
			System.out.println();
		}
	}
}
public class Methods2 
{
	public static void main(String[] args) 
	{
		Sample2 stars=new Sample2();
		stars.displaystars(2);
	}
}
