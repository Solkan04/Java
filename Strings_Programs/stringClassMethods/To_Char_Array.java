package stringClassMethods;

public class To_Char_Array 
{
	public static void main(String[] args)
	{
		tochararray();
	}
	static void tochararray()
	{
		String str1="INDIA";
		char ch[]=str1.toCharArray();
		for(char rs:ch)
		{
			System.out.println(rs);
		}
	}
}
//the string method "tochararray()" converts string to character array.