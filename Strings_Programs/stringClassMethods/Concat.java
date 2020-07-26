package stringClassMethods;

public class Concat 
{
	public static void main(String[] args) 
	{
		concat();
	}
	static void concat()
	{
		String str1="Bhagath";
		String str2="Singh";
		String strres=str1.concat(" " +str2);
		System.out.println(strres);
	}
}
//the string method "concat()" combines the two strings
