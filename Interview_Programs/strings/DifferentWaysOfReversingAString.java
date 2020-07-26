package strings;

public class DifferentWaysOfReversingAString
{
	public static void main(String[] args) 
	{
		//reverseString1("Raichur");
		//reverseString2("RAICHUR");
		reverseString3("RAICHUR");
		//reverseString4("RAICHUR");
	}

	//case 1:
	static void reverseString1(String str)
	{
		String strRes="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			strRes+=String.valueOf(ch[i]);
		}
		
		System.out.println(strRes);
	}
	
	
	//case 2:
	static void reverseString2(String str)
	{
		String strRes="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			strRes+=String.valueOf(str.charAt(i));
		}
		
		System.out.println(strRes);
	}
	
	
	//case 3:
	static void reverseString3(String str)
	{
		String strRes="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strRes+=str.substring(i, i+1);
		}
		System.out.println(strRes);
	}
	
	
	//case 4:
	static void reverseString4(String str)
	{
		String strRes="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			strRes+=str.substring(i, i+1);
		}
		System.out.println(strRes);
	}
}
