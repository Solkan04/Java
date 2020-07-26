package stringClassMethods;

public class Starts_With 
{
	public static void main(String[] args) 
	{
		startswith();
		startswith1();
	}
	static void startswith()
	{
		String str="Welcome to JAVA";
		boolean ststr=str.startsWith("to");
		System.out.println(ststr);
	}
	static void startswith1()
	{
		String str="welcome to JAVA";
		boolean ststr=str.startsWith("welcome");
		System.out.println(ststr);
	}
}
//the string method "startswith()" checks whether the string starts with or not. Returns boolean.