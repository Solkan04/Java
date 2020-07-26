package interviewJavaPrograms;

public class RemoveWhiteSpacesFromString 
{
	public static void main(String[] args) 
	{
		String str="Sharanu Gubbi    Gulbarga  ";
		String replace=str.replaceAll("\\s", "");
		System.out.println(replace);
		
	}
	
}
