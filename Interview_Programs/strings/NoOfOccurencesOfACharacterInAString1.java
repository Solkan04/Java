package strings;
//Find number of occurrences of a character in a given string
public class NoOfOccurencesOfACharacterInAString1 
{
	public static void main(String[] args) 
	{
		String input="India is great. India is 7th largest country. India is 2nd most populated country";
		charAtDemo(input, 'i');
	}
	static void charAtDemo(String str, char ch)
	{
		int charcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				charcount++;
			}
		}
		System.out.println(""  + charcount);
	}
}
