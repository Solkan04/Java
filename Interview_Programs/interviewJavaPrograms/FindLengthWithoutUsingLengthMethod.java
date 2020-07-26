package interviewJavaPrograms;

public class FindLengthWithoutUsingLengthMethod 
{
	public static void main(String[] args) 
	{
		String str="Sharanu Gubbi";
		//System.out.println(str.length());
		int length=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			length++;
		}
		System.out.println("Length of the string is : "+length);
		
	}
}
