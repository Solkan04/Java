package stringClassMethods;

public class Value_Of 
{
	public static void main(String[] args) 
	{
		valueof();
	}
	static void valueof()
	{
		String str="Bangalore";
		String ch=String.valueOf(str.charAt(3));
		System.out.println(ch);
		//=============================
		String length=String.valueOf(str.length());
		System.out.println(length);
		//=========================
		String blnRes = String.valueOf(str.equals("Bangalore"));
		System.out.println(blnRes);
	}
}
//the string method "valueof()", converts everything into a string.
