package interface_demo;

interface Sample11 {
	final int intAge=25;
	public String name = "Modi";
	static String address = "Vijay nagar, Bangalore";
	String strName = "Kalam";

	abstract void displayName();

	void displayCity();

	static void displayState() {
		System.out.println("The state name is KARNATAKA");
	}

	default void displayCountry() {
		System.out.println("The country is INDIA");
	}
}

class Child1 implements Sample11 {
	public void displayName() {
		System.out.println("The name is Abdul Kalam");
	}

	public void displayCity() {
		System.out.println("The city name is : Raichur");
	}

	void childMethod() {
		System.out.println("This is the child class method");
	}
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		ch1.displayName();
		ch1.displayCity();
		ch1.displayCountry();
		Sample11.displayState();
		// =======================
		System.out.println("********************");
		Sample11 s1 = new Child1();
		// s1.childMethod(); // through Interface reference, the child class
		// members can't be accessed
		s1.displayName();
		s1.displayCity();
		s1.displayCountry();
	}
}