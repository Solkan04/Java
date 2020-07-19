package interface_demo;

interface Example2
{
	void Print();
}
class Sample2 implements Example2
{
	public void Print()//mandatory to use public keywords while implementing interface methods
	{
		System.out.println("Mandatory to use public keyword while implementing interface methods");
	}
}
public class InterfaceDemo4 
{
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		s2.Print();
	}
}
//By default all the methods in interface are 'public' & 'abstract'.[Compiler adds these keywords].
//Hence optional to use 'public' & 'abstract' keywords in interface.

