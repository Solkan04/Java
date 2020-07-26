package interviewJavaPrograms;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//usingInBuilt();
		withoutUsingInBuilt();
		
	}
	public static void usingInBuilt()
	{
		String str="Sharanu";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	static void withoutUsingInBuilt()
	{
		String s="GUBBI";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
