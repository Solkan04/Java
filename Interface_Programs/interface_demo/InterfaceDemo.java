package interface_demo;

interface Example
{
	void showname();//compiler automatically adds 'public' & 'abstract' keywords before void showname();
}
public class InterfaceDemo implements Example
{
	public void showname()//should always use 'public keyword while implementing Parent class methods
	{
		System.out.println("The name is Mahesh");
	}
	public static void main(String[] args) 
	{
		InterfaceDemo ID=new InterfaceDemo();
		ID.showname();
	}
}
