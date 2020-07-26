package stringMethods;

public class StringClassMethods1 {
	public static void main(String[] args) {
		//toLowerCaseDemo();
		//toUpperCaseDemo();
		//lengthDemo();
		//subStringDemo();
		//charAtDemo();
		//subSequenceDemo();
		//startsWithDemo();
		//endsWithDemo();
		//containsDemo();
	}
 
	//toLowerCase
	static void toLowerCaseDemo()
	{
		String str="Welcome to JAVA";
		String strRes= str.toLowerCase();
		System.out.println(strRes);
	}
	
	//toUpperCase
	static void toUpperCaseDemo()
	{
		String str="Welcome to JAVA";
		String strRes= str.toUpperCase();
		System.out.println(strRes);
	}
	
	//length
	static void lengthDemo()
	{
		String str="Welcome to JAVA";
		int len=str.length();
		System.out.println(len);
	}
	
	//subString
	static void subStringDemo()
	{
		String str="Welcome to JAVA";
		String strRes1=str.substring(11);
		System.out.println(strRes1);
		//=========================
		String strRes2=str.substring(0, 7);
		System.out.println(strRes2);
	}
	
	
	//charAt
	static void charAtDemo()
	{
		String str="Welcome to JAVA";
		char character=str.charAt(5);
		System.out.println(character);
	}
	
	//subSequence
	static void subSequenceDemo()
	{
		String str="Welcome to JAVA";
		CharSequence strRes=str.subSequence(0, 7);
		System.out.println(strRes);
	}
	
	
	//startsWith
	static void startsWithDemo()
	{
		String str="Welcome to JAVA";
		boolean blnRes1=str.startsWith("JAVA");
		System.out.println(blnRes1);
		//=========================
		boolean blnRes2=str.startsWith("Welcome");
		System.out.println(blnRes2);
	}
	
	
	//endsWith
	static void endsWithDemo()
	{
		String str="Welcome to JAVA";
		boolean blnRes1=str.endsWith("JAVA");
		System.out.println(blnRes1);
		//===============================
		boolean blnRes2=str.endsWith("to");
		System.out.println(blnRes2);
	}
	
	
	//contains
	static void containsDemo()
	{
		String str="Welcome to JAVA";
		boolean blnRes1=str.contains("JAVA");
		System.out.println(blnRes1);
		//====================================
		boolean blnRes2=str.contains("SQL");
		System.out.println(blnRes2);
	}
}