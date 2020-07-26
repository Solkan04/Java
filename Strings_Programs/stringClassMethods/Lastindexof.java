package stringClassMethods;

public class Lastindexof 
{
	public static void main(String[] args) 
	{
		Lastindexofdemo();
	}
	static void Lastindexofdemo()
	{
		String str="Bangalore is garden is city";
		int posi1=str.lastIndexOf('s');
		System.out.println(posi1);
		//===============================
		int posi2=str.lastIndexOf('s', str.indexOf('s'));
		System.out.println(posi2);
		//=============================
		int posi3=str.lastIndexOf("is");
		System.out.println(posi3);
		//==============================
		int posi4=str.lastIndexOf("is",str.indexOf("is"));
		System.out.println(posi4);
	}
}
