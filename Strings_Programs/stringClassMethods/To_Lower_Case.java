package stringClassMethods;

public class To_Lower_Case 
{
	public static void main(String[] args) 
	{
		lowercase();
	}
	
	static void lowercase()
	{
		String str="Welcome to JAVA";
		String strres=str.toLowerCase();
		System.out.println(strres);
	}
}
//the string method "toLowerCase()" will convert the given string into lower case. Returns String in lower case
