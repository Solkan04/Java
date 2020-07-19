package encapsulation_demo;

class Sample11111 {
	private int salary;

	void setPrivate(int salary) {
		this.salary = salary;
	}

	int getPrivate() {
		return salary;
	}
}

public class AccessPrivateMembers {
	public static void main(String[] args) {
		Sample11111 s1 = new Sample11111();
		s1.setPrivate(90000);
		int res = s1.getPrivate();
		System.out.println(res);
	}
}