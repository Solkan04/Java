package stringBuilder_stringBuffer;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		//appendDemo();
		//appendDemo("Abdul", "Kalam");
		//deleteDemo(new StringBuffer("Bangalore"));
		//deleteCharAtDemo("India");
		//insertDemo("abcd");
		reverseDemo("RAICHUR");
	}
	
	//append
	static void appendDemo()
	{
		StringBuffer str1=new StringBuffer("india");
		StringBuffer strRes=str1.append(" is great");
		System.out.println(strRes);
	}
	
	static void appendDemo(String str1, String str2)
	{
		StringBuffer sVal1=new StringBuffer(str1);
		StringBuffer sVal2=new StringBuffer(str2);
		StringBuffer strRes=sVal1.append(" "+sVal2);
		System.out.println(strRes);
	}
	
	
	//delete
	static void deleteDemo(StringBuffer str1)
	{
		StringBuffer strRes=str1.delete(0, 2);
		System.out.println(strRes);
	}
	
	//deleteCharAt
	static void deleteCharAtDemo(String str1)
	{
		StringBuffer str=new StringBuffer(str1);
		StringBuffer strRes=str.deleteCharAt(3);
		System.out.println(strRes);
	}
	
	//insert
	static void insertDemo(String str1)
	{
		StringBuffer str=new StringBuffer(str1);
		StringBuffer strRes=str.insert(0, "BBBBB");
		System.out.println(strRes);
	}
	
	//reverse
	static void reverseDemo(String str1)
	{
		StringBuffer str=new StringBuffer(str1);
		StringBuffer strRes = str.reverse();
		System.out.println(strRes);
	}
}