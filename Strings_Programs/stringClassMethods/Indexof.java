package stringClassMethods;

public class Indexof 
{
	public static void main(String[] args) 
	{
		IndexofDemo();
	}
	static void IndexofDemo()
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
}

