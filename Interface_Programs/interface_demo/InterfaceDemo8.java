package interface_demo;
//How subclass implements abstract method from the interface with parameterized methods
interface University
{
	void displayUniversityName(String Name);
	abstract void displayCity(String City);//optional to use abstract keyword in interface 
}
class BMSEngg implements University
{
	public void displayUniversityName(String Name)//mandatory to use public keyword while implementing interface
	{
		System.out.println("The University Name is: " +Name);
	}
	public void displayCity(String City)
	{
		System.out.println("The City is: " +City);
	}
	void showAddress(String address)
	{
		System.out.println("the address is: " +address);
	}
}
public class InterfaceDemo8 
{
	public static void main(String[] args) 
	{
		BMSEngg bms=new BMSEngg();
		bms.displayUniversityName("VTU");
		bms.displayCity("Bengaluru");
		bms.showAddress("533/21, Gutte anjenaya Devasthanada Raste");
	}
}
