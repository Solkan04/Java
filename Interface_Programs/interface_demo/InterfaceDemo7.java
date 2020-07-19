package interface_demo;

interface Example4
{
	int age=25;//By default public,static,final.
	String Companyname="IBM";//By default public,static,final
	void name();//By default public & abstract AND accepts only abstract methods till JAVA-7
	default void cityname()//accepts default methods from JAVA-8
	{
		System.out.println("The city is Bengaluru");
	}
	static void statename()//accepts static methods from JAVA-8
	{
		System.out.println("The state is Karanataka");
	}
}
class Sample4 implements Example4
{
	public void name()//must use 'public' keyword while implementing interface methods
	{
		System.out.println("The name is Mahesh ");
	}
	public void countryname()
	{
		System.out.println("The country name is INDIA");
	}
}
public class InterfaceDemo7 
{
	public static void main(String[] args) 
	{
		Sample4 s4=new Sample4();
		s4.name();
		System.out.println("Age is: " +Example4.age);
		System.out.println("The company name is: " +Example4.Companyname);
		s4.cityname();
		Example4.statename();//static methods in interface can't be accessed though child object. It should be access only in static way.
		s4.countryname();
		System.out.println("###################################");
		Example4 e4=new Sample4();
		e4.name();
		System.out.println(Example4.age);
		System.out.println(Example4.Companyname);
		e4.cityname();
		Example4.statename();
		//e4.countryname();//cannot access child class methods with parent class reference
	}
}
