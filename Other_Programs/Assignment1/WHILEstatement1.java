package Assignment1;
//display the even numbers from 100 to 80 using WHILE
public class WHILEstatement1 
{
	public static void main(String[] args) 
	{
		int i=100;
		while(i>=80)
		{
			if(i%2==0)
			{
				System.out.println(""+i);
				i-=2;
			}
		}
	}
}
