package abstractclass_demo;

abstract class Parent4 {
	void showName() {
		System.out.println("The name is Modi");
	}

	void showAge() {
		System.out.println("The age is 65");
	}
}

class Child5 extends Parent4 {
	void cityName() {
		System.out.println("The city name is Raichur");
	}

	void address() {
		System.out.println("The address name is Vijay nagar , Bagnaglore");
	}
}

public class AbstractClassAsReferenceToChildClass {
	public static void main(String[] args) {
		Parent4 p4 = new Child5();
		p4.showAge();
		p4.showName();
		// p4.cityName(); //Child class members can't be accessed
		// p4.address(); //Child class members can't be accessed
		System.out.println("***************************");
		Child5 ch5 = new Child5();
		ch5.address();
		ch5.showAge();
		ch5.showName();
		ch5.cityName();
	}
}