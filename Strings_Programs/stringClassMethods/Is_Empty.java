package stringClassMethods;

public class Is_Empty 
{
	public static void main(String[] args) 
	{
		isempty();
	}
	static void isempty()
	{
		String str="";
		//String str=new String();
		boolean blnres=str.isEmpty();
		System.out.println(blnres);
	}
}
//the string method "isempty()" check whether the string is empty or not.
//It returns boolean value.
