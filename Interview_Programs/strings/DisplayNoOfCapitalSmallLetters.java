package strings;
//Display no of Capital letters & small letters in a given string
public class DisplayNoOfCapitalSmallLetters 
{
	public static void main(String[] args) 
	{
		charAtDemo();
	}
	static void charAtDemo()
	{
		String str="AbcDeFgH";
        int uppercase=0,lowercase=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90)
            {
                uppercase++;
            }
            else if(asciivalue >=97 && asciivalue <=122)
            {
                lowercase++;
            }
        }
        System.out.println("No of lowercase letter : " + lowercase);
        System.out.println("No of uppercase letter : " + uppercase);
	}
}
