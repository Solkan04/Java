package stringClassMethods;

public class Content_Equals 
{
	public static void main(String[] args) 
	{
		contentequals();
		contentequals1();
	}
	static void contentequals()
	{
		String str1="Bangalore";
		CharSequence str2="Bangalore";
		boolean blnRes=str1.contentEquals(str2);
		System.out.println(blnRes);
	}
	static void contentequals1()
	{
		String str3="India";
		String str4="india";
		boolean blnRes1=str3.contentEquals(str4);
		System.out.println(blnRes1);
	}
}
//Returns boolean value. Similar to compareto & comparetoignorecase.
//we can pass charsequence as well as string buffer.
