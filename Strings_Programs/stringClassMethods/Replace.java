package stringClassMethods;

public class Replace 
{
	public static void main(String[] args) 
	{
		replace();
	}
	static void replace()
	{
		String str1="JAVA supports oops. JAVA is a programming language";
		String strRes=str1.replace("JAVA", "C++");
		System.out.println(strRes);
	}
}
//the string method "replace()", replaces the specific string with a given string.
//In this case, it replaces JAVA with C++.
