package stringClassMethods;

public class Replace_All 
{
	public static void main(String[] args) 
	{
		replaceall();
	}
	static void replaceall()
	{
		String str1="JAVA supports oops. JAVA is a programming language";
		String strRes=str1.replaceAll("JAVA", "C++");
		System.out.println(strRes);
	}
}
//the string method "replaceall()" is same as "replace()"
