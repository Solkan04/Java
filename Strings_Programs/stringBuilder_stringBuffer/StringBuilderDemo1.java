package stringBuilder_stringBuffer;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		appendDemo();
		//appendDemo("Abdul", "Kalam");
		//deleteDemo(new StringBuilder("Bangalore"));
		//deleteCharAtDemo("India");
		//insertDemo("abcd");
		//reverseDemo("mahesh");
	}
	
	//append
	static void appendDemo()
	{
		StringBuilder str1=new StringBuilder("india");
		StringBuilder strRes=str1.append(" is great");
		System.out.println(strRes);
	}
	
	static void appendDemo(String str1, String str2)
	{
		StringBuilder sVal1=new StringBuilder(str1);
		StringBuilder sVal2=new StringBuilder(str2);
		StringBuilder strRes=sVal1.append(" "+sVal2);
		System.out.println(strRes);
	}
	
	
	//delete
	static void deleteDemo(StringBuilder str1)
	{
		StringBuilder strRes=str1.delete(0, 2);
		System.out.println(strRes);
	}
	
	//deleteCharAt
	static void deleteCharAtDemo(String str1)
	{
		StringBuilder str=new StringBuilder(str1);
		StringBuilder strRes=str.deleteCharAt(3);
		System.out.println(strRes);
	}
	
	//insert
	static void insertDemo(String str1)
	{
		StringBuilder str=new StringBuilder(str1);
		StringBuilder strRes=str.insert(0, "BBBBB");
		System.out.println(strRes);
	}
	
	//reverse
	static void reverseDemo(String str1)
	{
		StringBuilder str=new StringBuilder(str1);
		StringBuilder strRes = str.reverse();
		System.out.println(strRes);
	}
}