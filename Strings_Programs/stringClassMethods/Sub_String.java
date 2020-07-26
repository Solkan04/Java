package stringClassMethods;

public class Sub_String 
{
	public static void main(String[] args) 
	{
		substring();
		substring1();
	}
	static void substring()
	{
		String str="Welcome to JAVA";
		String sstr=str.substring(11);
		//the string method "substring(int beginIndex)" displays the characters in a given string from the 10th character.
		System.out.println(sstr);
	}
	static void substring1()
	{
		String str="Welcome to JAVA";
		String sstr=str.substring(5, 11);
		//the string method "substring(int beginIndex, int endIndex)" displays the characters in a given string from 5th character to the character before 12th.
		System.out.println(sstr);
	}
}
//the string method "substring()" is used to extract the characters/character from the given string.
//Return type is String
