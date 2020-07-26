package stringClassMethods;

public class Subsequence 
{
	public static void main(String[] args) 
	{
		SunsequenceDemo();
	}
	static void SunsequenceDemo()
	{
		String str="Welcome to JAVA";
		CharSequence strRes=str.subSequence(0,7);
		System.out.println(strRes);
	}
}
