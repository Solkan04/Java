package methods_demo;
//Display even numbers using method
class Sample1111
{
	String evenNumber(int intRange)
	{
		String str="";
		for(int i=0;i<=intRange;i++)
		{
			if((i%2)==0)
			{
				str+=String.valueOf(i)+" ";
			}
		}
		return str;
	}
}
public class Methods2 
{
	public static void main(String[] args) 
	{
		Sample1111 S1=new Sample1111();
		String res=S1.evenNumber(10);
		System.out.println(res);
	}
}
