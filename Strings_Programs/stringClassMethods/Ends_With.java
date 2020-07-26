package stringClassMethods;

public class Ends_With 
{
	public static void main(String[] args) 
	{
		endswith();
		endswith1();
	}
	
	static void endswith()
	{
		String str="Welcome to JAVA";
		boolean sstr=str.endsWith("to");
		System.out.println(sstr);
	}
	static void endswith1()
	{
		String str="Welcome to JAVA";
		boolean sstr=str.endsWith("JAVA");
		System.out.println(sstr);
	}
}
//the string method "endswith()" checks whether the string ends with or not.
//it returns boolean.