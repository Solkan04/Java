package constructor_demo;

public class Parameterizedconstructor1 
{
	Parameterizedconstructor1(int k)
	{
		System.out.println(k);
	}
	Parameterizedconstructor1()//When parameterized constructor is created then the default constructor has to be created explicitly
	{
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) 
	{
		new Parameterizedconstructor1(100);//calls the parameterized constructor
		new Parameterizedconstructor1();//calls the default constructor
	}
}
