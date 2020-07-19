package constructor_demo;

public class ConstructoroverloadingA 
{
	public static void main(String[] args) 
	{
		ConstructoroverloadingA Con1=new ConstructoroverloadingA();
		ConstructoroverloadingA Con2=new ConstructoroverloadingA("Mahesh");
		ConstructoroverloadingA Con3=new ConstructoroverloadingA(30);
		ConstructoroverloadingA Con4=new ConstructoroverloadingA(9999,"Dell");
		ConstructoroverloadingA Con5=new ConstructoroverloadingA("Hp", 8888);
	}
	ConstructoroverloadingA()
	{
		System.out.println("Default Constructor");
	}
	ConstructoroverloadingA(String name)
	{
		System.out.println("String parameter");
	}
	ConstructoroverloadingA(int age)
	{
		System.out.println("int parameter");
	}
	ConstructoroverloadingA(int salary, String company)
	{
		System.out.println("1 int parameter , 1 string parameter");
	}
	ConstructoroverloadingA(String company, int salary)
	{
		System.out.println("1 string company , 1 int parameter");
	}
}
