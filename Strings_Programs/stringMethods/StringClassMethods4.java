package stringMethods;

class Sample 
{
	String FN;
	String LN;
	int age;
	Sample(String sFN, String sLN, int age) 
	{
		FN = sFN;
		LN = sLN;
		this.age = age;
	}

	public String toString() 
	{
		return "FN: " + FN + ", LN: " + LN + " & age is :" + this.age;
	}
}

public class StringClassMethods4 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample("Abdul", "Kalam", 80);
		System.out.println(s1);
		Sample s2 = new Sample("Narendra", "Modi", 60);
		System.out.println(s2);
	}
}