package interface_demo;

interface Example1
{
	int i=20;//Mandatory to initialize variable in interface.
}
class Sample1 implements Example1
{
	void Sample()
	{
		System.out.println("Variable must be initialised in interface: " +i);
	}
}
public class InterfaceDemo3 
{
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.Sample();
	}
}
//By default all variables in interface are 'public', 'static', & 'final'.[compiler adds these keywords]
