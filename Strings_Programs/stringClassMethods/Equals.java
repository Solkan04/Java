package stringClassMethods;

public class Equals 
{
	public static void main(String[] args) 
	{
		equals();
		equals1();
	}
	static void equals()
	{
		String str1="Bengalore";
		String str2="bengalore";
		boolean bln=str1.equals(str2);
		System.out.println(bln);
	}
	static void equals1()
	{
		String str1="India";
		String str2="India";
		boolean bln=str1.equals(str2);
		System.out.println(bln);
	}
}
//the string method "equals()" is case sensitive. It returns boolean value.
