package inheritance;

class Parent10
{
	int k;
	Parent10(int x)
	{
		k=x;
		System.out.println("Super class 'K' :"+k);
	}
}

class Child12 extends Parent10
{
	int k;
	Child12(int a, int b)
	{
		super(a);
		k=b;
		System.out.println("Chils class 'K' :"+k);
	}
}
public class Super_Child_Variable_WithConst {
	public static void main(String[] args) {
		Child12 ch12=new Child12(20, 30);
	}
}