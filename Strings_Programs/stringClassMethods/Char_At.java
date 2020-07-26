package stringClassMethods;

public class Char_At 
{
	public static void main(String[] args) 
	{
		charat();
	}
	static void charat()
	{
		String str="Welcome to JAVA";
		char cstr=str.charAt(5);
		System.out.println(cstr);
	}
}
//the string method "charAt()" displays the position of the character.
