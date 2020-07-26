package stringClassMethods;

public class Compare_To 
{
	public static void main(String[] args) 
	{
		compareto();
		compareto1();
		compareto2();
	}
	static void compareto()
	{
		String str1="bengaluru";
		String str2="mysore";
		int strRes=str1.compareTo(str2);
		System.out.println(strRes);
	}
	static void compareto1()
	{
		String str1="india";
		String str2="india";
		int strRes=str1.compareTo(str2);
		System.out.println(strRes);
	}
	static void compareto2()
	{
		String str1="Karnataka";
		String str2="karnataka";
		int strRes=str1.compareTo(str2);
		System.out.println(strRes);
	}
}
//the string method "compareto()" is similar to "equals()" but return type is integer.
//if output is "0" then the values are same.
//if output is "32" then the first string is bigger than second string.
//if output is "-32" then the second string is bigger than first string.
