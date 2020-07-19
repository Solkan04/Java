package thiskeyword_demo;
//accessing non-static variable directly
//another way of calling a constructor
public class L 
{
	int i=10;
	L()
	{
		System.out.println("L");
	}
	public static void main(String[] args) 
	{
		System.out.println(new L().i);//instead of L l=new L(), we're accessing the non-static variable(i) directly without reference variable(l).
		//here "new L()" is an object created
	}
}
