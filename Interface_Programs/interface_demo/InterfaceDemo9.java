package interface_demo;
//How subclass implements abstract method from the interface
interface University1
{
	void displayUniversityName(String Name);
	abstract void displayCity(String City);//optional to use abstract keyword in interface 
}
class BMSEngg1 implements University1
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
public class InterfaceDemo9
{
	public static void main(String[] args) 
	{
		University1 u=new BMSEngg1();
		u.displayUniversityName("VTU");
		u.displayCity("Bengaluru");
		//u.showAddress("533/21, Gutte anjenaya Devasthanada Raste");//cannot access child class member
	}
}
//We cannot create object for interface. But we can provide only object reference to child class.
//In the above case, the members which are known by interface only can be accessible
