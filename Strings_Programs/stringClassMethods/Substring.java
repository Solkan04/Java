package stringClassMethods;

public class Substring 
{
	public static void main(String[] args) 
	{
		subStringDemo();
	}
	static void subStringDemo()
	{
		String str="Welcome to JAVA";
		String strRes1=str.substring(11);
		System.out.println(strRes1);
		//=========================
		String strRes2=str.substring(0, 7);
		System.out.println(strRes2);
	}	
}
