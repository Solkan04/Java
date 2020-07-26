package interviewJavaPrograms;

public class StringRemoveAllSpace 
{
	public static void main(String[] args) 
	{
		String str="Sharanu Gubbi   Kapnoor ";
		String noSpace=str.replaceAll("\\s","");
		System.out.println(noSpace);	
	}

}
