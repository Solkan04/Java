package superkeyword_demo;
//Super keyword with non-static method
class Parent
{
	public void test()//Parent class non-static method
	{
		System.out.println("Test");
	}
}
class Child extends Parent
{
	public void test1()//Child class non-static method
	{
		super.test();//Calling Parent class method
		System.out.println("Test1");
	}
}
public class Superkeyword 
{
	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.test1();//Calling child class non-static method
	}
}
//Super keyword is used to call members of parent class
//To use super keyword, inheritance is mandatory
//To use super keyword, it is mandatory to create object