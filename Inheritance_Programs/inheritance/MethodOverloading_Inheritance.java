package inheritance;

class Parent6
{
	void display(String sName)
	{
		System.out.println("The Name is :"+sName);
	}
	
	void display(String FN, String LN)
	{
		System.out.println("The FN :"+FN+", LN : "+LN);
	}
}

class Child8 extends Parent6
{
	void display(String FN, String MN, String LN)
	{
		System.out.println("The FN :"+FN+", Miidle Name : "+MN+"& LN :"+LN);
	}
}
public class MethodOverloading_Inheritance {
	public static void main(String[] args) {
		Child8 ch8=new Child8();
		ch8.display("Kalam");
		ch8.display("Abdul", "Kalam");
		ch8.display("Narendra", "Damodhar", "Modi");
	}
}