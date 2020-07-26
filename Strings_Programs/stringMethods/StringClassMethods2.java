package stringMethods;

public class StringClassMethods2 {
	public static void main(String[] args) {
		indexOfDemo();
		//lastIndexOfDemo();
		//trimDemo();
		//concatDemo();
		//replaceDemo();
		//splitDemo();
	}
	
	//indexOf
	static void indexOfDemo()
	{
		String str="Bangalore is garden is city";
		int posi1=str.indexOf('g');
		System.out.println(posi1);
		//===================================
		int posi2=str.indexOf("city");
		System.out.println(posi2);
		//==================================
		int posi3=str.indexOf('g', 10);
		System.out.println(posi3);
		//===============================
		int posi4=str.indexOf("is", 12);
		System.out.println(posi4);
	}
	
	//lastIndexOf
	static void lastIndexOfDemo()
	{
		String str="Bangalore is garden is city";
		int posi1=str.lastIndexOf('s');
		System.out.println(posi1);
		//===============================
		int posi2=str.lastIndexOf('s', str.indexOf('s'));
		System.out.println(posi2);
		//=============================
		int posi3=str.lastIndexOf("is");
		System.out.println(posi3);
		//==============================
		int posi4=str.lastIndexOf("is",str.indexOf("is"));
		System.out.println(posi4);
	}
	
	//trim
	static void trimDemo()
	{
		String str="           india            is great                    ";
		String strRes=str.trim();
		System.out.println(strRes);
	}
	
	
	//concat
	static void concatDemo()
	{
		String str1="Narendra";
		String str2="Modi";
		
		String strRes=str1.concat(" "+str2);
		System.out.println(strRes);
	}
	
	
	//replace
	static void replaceDemo()
	{
		String str="Java supports OOPs. Java is a programming language";
		String strRes1=str.replace("Java", "C++");
		System.out.println(strRes1);
		//====================================
		String strRes2=str.replaceAll("Java", "C++");
		System.out.println(strRes2);
		//===================================
		String strRes3=str.replaceFirst("Java", "C++");
		System.out.println(strRes3);
	}
	
	
	//split
	static void splitDemo()
	{
		String str="Java supports OOPs";
		String arr[]=str.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//=============================
		String str2="A#B#####";
		String arr2[]=str2.split("#",-1);
		System.out.println(arr2.length);
		//===================================
		String str3="A,B,C,D,E";
		String arr3[]=str3.split(",", 2);
		for(String s:arr3)
		{
			System.out.println(s);
		}
	}
}