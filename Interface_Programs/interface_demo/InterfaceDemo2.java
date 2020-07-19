package interface_demo;
//Class extends Class. Class implements interface.
interface xyz1
{
	void showname();
	void displayage();
	default void defmethod()
	{
		System.out.println("Interface Default method");
	}
}
class abc1
{
	public void showcity()
	{
		System.out.println("The city is Bengaluru");
	}
}
class mno1 extends abc1 implements xyz1
{
	public void showname()
	{
		System.out.println("The name is Mahesh");
	}
	public void displayage()
	{
		System.out.println("The age is 25");
	}
}
public class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		mno1 obj=new mno1();
		obj.defmethod();
		obj.showname();
		obj.displayage();
		obj.showcity();
	}

}
