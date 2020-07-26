package stringClassMethods;

public class Replace_First 
{
	public static void main(String[] args) 
	{
		replacefirst();
	}
	static void replacefirst()
	{
		String str1="JAVA supports opps. JAVA is a programming language";
		String strRes=str1.replaceFirst("JAVA", "C++");
		System.out.println(strRes);
	}
}
//the string method "replacefirst()" replaces the first string.
