package inheritance;

class Parent9
{
	int k;
}

class Child11 extends Parent9
{
	int k;
	Child11(int x, int y)
	{
		super.k=x;
		k=y;
		System.out.println("Super class 'K' :"+super.k);
		System.out.println("Child class 'K' :"+k);
	}
}
public class Super_Child_Variable_WithoutConst {
	public static void main(String[] args) {
		Child11 ch11=new Child11(10, 20);
	}
}