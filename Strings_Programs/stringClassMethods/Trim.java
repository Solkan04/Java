package stringClassMethods;

public class Trim 
{
	public static void main(String[] args) 
	{
		trim();
	}
	static void trim()
	{
		String str="    the   largest country       ";
		String str1=str.trim();
		System.out.println(str1);
	}
}
//the string method "trim()" removes the leftside & rightside space but cannot remove middle space.
//It returns String.
