package stringClassMethods;

public class Equals_Ignore_Case 
{
	public static void main(String[] args) 
	{
		equalsignorecase();
	}
	static void equalsignorecase()
	{
		String str1="Bengaluru";
		String str2="bengaluru";
		boolean bln=str1.equalsIgnoreCase(str2);
		System.out.println(bln);
	}
}
//the string method "equalsignorecase()" ignores the case sensitivity. Returns boolean value
