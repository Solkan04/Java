package stringClassMethods;

public class Tolowercase 
{
	public static void main(String[] args) 
	{
		toLowerCaseDemo();
	}
	
	static void toLowerCaseDemo()
	{
		String str="Welcome to JAVA";
		String strRes= str.toLowerCase();
		System.out.println(strRes);
	}
}
//converts the given string into lower case
