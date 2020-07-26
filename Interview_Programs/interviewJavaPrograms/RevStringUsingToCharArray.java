package interviewJavaPrograms;

public class RevStringUsingToCharArray 
{
	public static void main(String[] args) 
	{
		String str="AppaILoveYou";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}

}
