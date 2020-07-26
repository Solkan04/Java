package interviewJavaPrograms;

public class RemoveSpecialCharacters 
{
	public static void main(String[] args) 
	{
		String str="@#$Appa I @*&) Love You 123";
		
		str= str.replaceAll("[^A-Za-z1-9]", "");
		System.out.println(str);
		
	}

}
