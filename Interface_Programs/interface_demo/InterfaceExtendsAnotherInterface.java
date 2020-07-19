package interface_demo;

interface Test11 {
	abstract void test1Method();
}

interface Test22 extends Test11 {
	abstract void test2Method();
}

class ChildA implements Test22 {
	public void test1Method() {
		System.out.println("Interface Test1: test1Method");
	}

	public void test2Method() {
		System.out.println("Interface Test2: test2Method");
	}
}

public class InterfaceExtendsAnotherInterface {
	public static void main(String[] args) {
		ChildA chA = new ChildA();
		chA.test1Method();
		chA.test2Method();
	}
}