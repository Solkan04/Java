package abstractclass_demo;
abstract class Enggcollege1
{
	abstract void displaycollegeName(String Name);
	abstract void displayCity(String City);
	void showBranches(String branches[])
	{
		System.out.println("Branches....");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println("Branch Name: " +branches);
		}
	}
}
class SLNEngg1 extends Enggcollege1
{
	void displaycollegeName(String Name)
	{
		System.out.println("The College Name is: " +Name);
	}
	void displayCity(String city)
	{
		System.out.println("The City Name is: " +city);
	}
	void displayaddress(String address)
	{
		System.out.println("The address of the college: " +address);
	}
}
public class AbstractDemo1 
{
	public static void main(String[] args) 
	{
		Enggcollege1 sln=new SLNEngg1();
		sln.displaycollegeName("SLN Engg");
		sln.displayCity("Bengaluru");
		//sln.displayaddress("1st main, 1st stage, RPC Layout");
		//we cannot create object for abstract class. but we can provide only the object reference.
		//in this case based on the reference variable[object] we can access members which are known by the abstract class
		String b[]={"CSE","EEE","Mech"};
		sln.showBranches(b);
	}
}
