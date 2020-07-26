package strings;
//String a="A B A C A Z A X"
//Find out each position of repeated string
public class FindEachPositionOfRepeatedString 
{
	public static void main(String[] args) 
	{
		IndexofDemo();
	}
	static void IndexofDemo()
	{
		String str="A B A C A Z A X";
		int POS=str.indexOf('A');
		System.out.println(POS);
		int POS1=str.indexOf('A', 1);
		System.out.println(POS1);
		int POS2=str.lastIndexOf('A');
		System.out.println(POS2);
		int POS3=str.lastIndexOf('A', 10);
		System.out.println(POS3);
	}
}
