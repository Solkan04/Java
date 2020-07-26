package assignment2;
//Display Odd numbers using Methods
class Odd
{
	String oddNumber(int intRange)
	{
		String str="";
		for(int i=1;i<=intRange;i++)
		{
			if((i%2)!=0)
			{
				str+=String.valueOf(i)+" ";
			}
		}
		return str;
	}
}
public class Methods 
{
	public static void main(String[] args) 
	{
		Odd Odd1=new Odd();
		String res=Odd1.oddNumber(19);
		System.out.println(res);
	}
}
