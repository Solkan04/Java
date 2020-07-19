package interface_demo;
//Multiple inheritance using interface with parameterized methods
interface University2
{
	void displayUniversityName(String Name);
	abstract void displayCity(String City);
}
interface College
{
	void ShowCollegeName(String Name);
}
class BMSEngg2 implements University2,College
{
	public void displayUniversityName(String Name)
	{
		System.out.println("The University Name: " +Name);
	}
	public void displayCity(String City)
	{ 
		System.out.println("The City is: " +City);
	}
	void showAddress(String address)
	{
		System.out.println("The address is: " +address);
	}
	public void ShowCollegeName(String Name)
	{
		System.out.println("The College Name is : " +Name);
	}
}
public class InterfaceDemo10 
{
	public static void main(String[] args) 
	{
		BMSEngg2 bms=new BMSEngg2();
		bms.displayUniversityName("VTU");
		bms.displayCity("Bengaluru");
		bms.ShowCollegeName("BMS College of Engineering");
		bms.showAddress("533/21 gutte anjenaya devasthanada raste");
	}
}
//A sub class can implement more than one interface, which indicates the concept of multiple inheritance
//Multiple inheritance cannot be achieved at class level
//Multiple inheritance can be achieved at interface level
