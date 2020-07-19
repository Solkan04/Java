package methods_demo;
//Print right angle triangle
class Sample3
{
	void displaystars(int rows)
	{
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
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
		Sample3 stars=new Sample3();
		stars.displaystars(10);
	}

}
