package interviewJavaPrograms;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str="mom";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		if(s.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
