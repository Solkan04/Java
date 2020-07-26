package interviewJavaPrograms;

public class StringImmutable 
{
	public static void main(String[] args) 
	{
		//Immutable
		String str="Sharanu";
		System.out.println(str);
		str.concat("Gubbi");
		System.out.println(str);
		
		//StringBuffer Mutable
		StringBuffer sb=new StringBuffer("Sharanu");
		sb.append(" Gubbi");
		System.out.println(sb);
	}

}
