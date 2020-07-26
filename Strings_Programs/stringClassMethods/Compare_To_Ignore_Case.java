package stringClassMethods;

public class Compare_To_Ignore_Case 
{
	public static void main(String[] args) 
	{
		comparetoignorecase();
		comparetoignorecase1();
		comparetoignorecase2();
	}
	static void comparetoignorecase()
	{
		String str1="bengalureans";
		String str2="Bengaluru";
		int strRes=str1.compareToIgnoreCase(str2);
		System.out.println(strRes);
	}
	static void comparetoignorecase1()
	{
		String str1="india";
		String str2="indians";
		int strRes=str1.compareToIgnoreCase(str2);
		System.out.println(strRes);
	}
	static void comparetoignorecase2()
	{
		String str1="Karnataka";
		String str2="Karnataka";
		int strRes=str1.compareToIgnoreCase(str2);
		System.out.println(strRes);
	}
}
