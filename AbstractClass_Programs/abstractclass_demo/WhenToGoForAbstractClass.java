package abstractclass_demo;

abstract class GeometricObject {
	abstract void findArea();

	abstract void findXAxis();

	abstract void displayObjetcName();
}

class Square extends GeometricObject {
	void findArea() {
		System.out.println("Square:Find area");
	}

	void findXAxis() {
		System.out.println("Square: findXAxis");
	}

	void displayObjetcName() {
		System.out.println("Square: displayObjetcName");
	}
}

class Circle extends GeometricObject {
	void findArea() {
		System.out.println("Circle: Find area");
	}

	void findXAxis() {
		System.out.println("Circle: findXAxis");
	}

	void displayObjetcName() {
		System.out.println("Circle: displayObjetcName");
	}
}

public class WhenToGoForAbstractClass {
	public static void main(String[] args) {
		Circle cr = new Circle();
		cr.displayObjetcName();
		cr.findArea();
		cr.findXAxis();
		System.out.println("**********************");
		Square sq = new Square();
		sq.displayObjetcName();
		sq.findArea();
		sq.findXAxis();
	}
}