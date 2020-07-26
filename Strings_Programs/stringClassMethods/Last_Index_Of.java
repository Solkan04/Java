package stringClassMethods;

public class Last_Index_Of 
{
	public static void main(String[] args) 
	{
		lastindexof();
	}
	static void lastindexof()
	{
		String str="India is the 7th largest country in the world";
		int pos1=str.lastIndexOf('l');
		System.out.println(pos1);
		System.out.println("***********************");
		int pos2=str.lastIndexOf("world");
		System.out.println(pos2);
		System.out.println("***********************");
		int pos3=str.lastIndexOf('t', 30);
		System.out.println(pos3);
		System.out.println("***********************");
		int pos4=str.lastIndexOf("country", 40);
		System.out.println(pos4);
	}
}
//the string method "lastindexof()" displays the position of the string/character.
//the count starts from left to right & displays from right to left
//it is similar to the string method "indexof()"
