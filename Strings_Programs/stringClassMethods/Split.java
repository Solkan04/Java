package stringClassMethods;

public class Split 
{
	public static void main(String[] args) 
	{
		//split();
		//split1();
		split2();
	}
	static void split()
	{
		String str1="JAVA supports oops";
		String arr[]=str1.split("\\s");
		for(String s:arr)
		{
			System.out.println(s);
		}
		System.out.println("----------------------------");
	}
	static void split1()
	{
		String str2="A#B#####";
		String arr1[]=str2.split("#",-1);
		System.out.println(arr1.length);
		System.out.println("-----------------------------");
	}
	static void split2()
	{
		String str3="Java is a programming language";
		String arr3[]=str3.split(" ",3);
		for(String s:arr3)
		{
			System.out.println(s);
		}
	}
}
//the string method "split()" converts the given string into array.
