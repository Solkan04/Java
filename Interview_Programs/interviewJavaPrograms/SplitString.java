package interviewJavaPrograms;

import java.util.StringTokenizer;

public class SplitString 
{
	public static void main(String[] args) 
	{
		withoutUsingsplitMethod();
		usingsplitmethod();
		
	}
	public static void withoutUsingsplitMethod()
	{
		String str="Sharanu Gubbi Kapnoor";
		StringTokenizer sToken=new StringTokenizer(str," ");
		//Enumeration
		while(sToken.hasMoreElements())
		{
			System.out.println(sToken.nextElement());
		}
		System.out.println("************************");
	}
	public static void usingsplitmethod()
	{
		String str1="Guru Gubbi Dubai";
		String [] s=str1.split(" ");
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
}
