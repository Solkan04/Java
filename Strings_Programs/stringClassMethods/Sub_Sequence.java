package stringClassMethods;

public class Sub_Sequence 
{
	public static void main(String[] args) 
	{
		subsequence();
	}
	
	static void subsequence()
	{
		String str="Welcome to JAVA";
		CharSequence chse=str.subSequence(2,12);
		//the string method "subSequence(int beginIndex, int endIndex)" display the string from 2nd character to before the 12th character.
		System.out.println(chse);
	}
}
//the string method "subsequence()" is similiar to the string method "substring()"
//but the return type is 'charsequence'