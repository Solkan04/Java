package stringClassMethods;

public class To_Upper_Case 
{
	public static void main(String[] args) 
	{
		uppercase();
	}
	
	static void uppercase()
	{
		String str="welcome to JAVA";
		String strres=str.toUpperCase();
		System.out.println(strres);
	}
}
//the string method "toUpperCase()" will convert the given string into upper case. Returns String in upper case
