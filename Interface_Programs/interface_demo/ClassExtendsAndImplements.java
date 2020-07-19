package interface_demo;

interface xyz {
	void displayName1();

	void showAge1();

	default void defMethod() {
		System.out.println("Default method from the interface");
	}
}

class ABC {
	public void cityName() {
		System.out.println("The city name Raichur");
	}
}

class MNO extends ABC implements xyz {
	public void showAge1() {
		System.out.println("The age is 80");
	}

	public void displayName1() {
		System.out.println("The name is Abdul Kalam");
	}
}

public class ClassExtendsAndImplements {
	public static void main(String[] args) {
		MNO mno = new MNO();
		mno.displayName1();
		mno.showAge1();
		mno.defMethod();
		mno.cityName();
	}
}