package interviewJavaPrograms;

class Pen
{

         void write()
	{
		System.out.println("Writing pen");
	}
}
class Marker extends Pen
{
	     void write()
	{
		System.out.println("Writing marker");
	}
}
public class InheritenceDemo 
{
	public static void main(String[] args) 
	{
		Pen p=new Marker();
		
		
		p.write();
		//p.write1();
	}

}
