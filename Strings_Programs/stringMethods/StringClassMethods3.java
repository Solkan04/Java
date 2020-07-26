package stringMethods;

public class StringClassMethods3 {
	public static void main(String[] args) {
		//equalsDemo();
		compareToDemo();
		//contentEqualsDemo();
		//toCharArrayDemo();
		//isEmptyDemo();
		//valueOfDemo();
	}

	//equals & equalsIgnoreCase
	static void equalsDemo()
	{
		String str1="Bangalore";
		String str2="Bangalore";
		boolean blnRes1=str1.equals(str2);
		System.out.println(blnRes1);
		//===========================
		String str3="Bangalore";
		String str4="bangalore";
		boolean blnRes2=str3.equalsIgnoreCase(str4);
		System.out.println(blnRes2);
	}
	
	
	//compareTo & compareToIgnoreCase
	static void compareToDemo()
	{
		String str1="bangalore";
		String str2="Bangalore";
		int intRes1=str1.compareTo(str2);
		System.out.println(intRes1);
		//=================================
		String str3="bangalore";
		String str4="cat";
		int intRes2=str3.compareToIgnoreCase(str4);
		System.out.println(intRes2);
	}
	
	
	//contentEquals
	static void contentEqualsDemo()
	{
		String str1="Bangalore";
		CharSequence str2="Bangalore";
		boolean blnRes=str1.contentEquals(str2);
		System.out.println(blnRes);
	}
	
	
	//toCharArray
	static void toCharArrayDemo()
	{
		String str1="Bangalore";
		char ch[]=str1.toCharArray();
		
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
	}
	
	//isEmpty
	static void isEmptyDemo()
	{
		String str="";
		//String str=new String();
		boolean blnRes = str.isEmpty();
		System.out.println(blnRes);
	}
	
	//valueOf
	static void valueOfDemo()
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