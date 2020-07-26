package stringClassMethods;

public class Index_Of 
{
	public static void main(String[] args) 
	{
		indexof();
	}
	
	static void indexof()
	{
		String str="India is the 7th largest country in the world";
		int pos1=str.indexOf("is");//displays the position of the string
		System.out.println(pos1);
		System.out.println("**************");
		int pos2=str.indexOf('g');//displays the position of the character
		System.out.println(pos2);
		System.out.println("**************");
		int pos3=str.indexOf('t', 10);//display the position of the character after the 10th position
		System.out.println(pos3);
		System.out.println("**************");
		int pos4=str.indexOf("the", 15);//displays the position of the string after the 15th position
		System.out.println(pos4);
	}
}
//the string method "indexof()" gives the position of the character which we are giving. count starts from left to right.
