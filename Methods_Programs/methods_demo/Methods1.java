package methods_demo;
//Display even numbers using methods
class sample11
{
	String evenNumber()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(" " +i);
			i++;
		}
		return "";
	}
}
public class Methods1 
{
	public static void main(String[] args) 
	{
		sample11 S1=new sample11();
		String res=S1.evenNumber();
		System.out.println(res);
	}
}
