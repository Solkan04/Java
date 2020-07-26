package interviewJavaPrograms;

public class CommonElementsIn2DA 
{
	public static void main(String[] args) 
	{
		String str="Sharan";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(" "+ch[i]);
		}
		
	}
	
}
