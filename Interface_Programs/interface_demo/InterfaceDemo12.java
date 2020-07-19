package interface_demo;
//How one interface can extend another interface
interface University3
{
	void displayUniversityName(String Name);
	abstract void displayCity(String City);
}
interface College1 extends University
{
	void showCollegeName(String Name);
}
class BMSEngg3 implements College1
{
	public void displayUniversityName(String Name)
	{
		System.out.println("The University Name is: " +Name);
	}
	public void displayCity(String City)
	{
		System.out.println("The City Name is: " +City);
	}
	public void showCollegeName(String Name)
	{
		System.out.println("The College Name: " +Name);
	}
	void showaddress(String address)
	{
		System.out.println("The address: " +address);
	}
}
public class InterfaceDemo12 
{
	public static void main(String[] args) 
	{
		BMSEngg3 bms=new BMSEngg3();
		bms.displayCity("Bengaluru");
		bms.displayUniversityName("VTU");
		bms.showaddress("533/21 Gutte Anjanaya Devasthanada Raste");
		bms.showCollegeName("BMS College of Engineering");
	}
}
