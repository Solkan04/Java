package stringClassMethods;

public class Contains 
{
	public static void main(String[] args) 
	{
		contains();
	}
	static void contains()
	{
		String str="welcome to JAVA";
		boolean sstr=str.contains("SQL");
		System.out.println(sstr);
		System.out.println("*****************************");
		boolean sstr1=str.contains("JAVA");
		System.out.println(sstr1);
		System.out.println("*****************************");
		boolean sstr2=str.contains("t");
		System.out.println(sstr2);
	}
}
//the string method "contains()" checks whether the word/letter is present or not.
