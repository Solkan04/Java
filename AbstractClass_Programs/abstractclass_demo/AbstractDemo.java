package abstractclass_demo;
abstract class Enggcollege
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
class SLNEngg extends Enggcollege
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
public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		SLNEngg sln=new SLNEngg();
		sln.displaycollegeName("SLN Engg");
		sln.displayCity("Bengaluru");
		sln.displayaddress("1st main, 1st stage, RPC Layout");
		String branches[]={"CSE","EEE","Mech"};
		sln.showBranches(branches);
	}
}
