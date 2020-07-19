package interface_demo;

interface A11 {
	public abstract void test1();
}

interface B11 {

	abstract void test1();
}

class C11 implements A11, B11 {
	public void test1() {
		System.out.println("this is the Interface 'Test1' method");
	}
}

public class InterfaceHavingSameMethod {
	public static void main(String[] args) {
		A11 a = new C11();
		a.test1();
		// ============================
		B11 b = new C11();
		b.test1();
		// ============================
		C11 c = new C11();
		c.test1();
	}
}