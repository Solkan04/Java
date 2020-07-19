package superkeyword_demo;
//super keyword with default constructor in the parent class
class Parent6
{
	Parent6()
	{
		System.out.println("Parent class default constructor");
	}
}
class Child6 extends Parent6
{
	Child6()
	{
		super();
		System.out.println("Child class default constructor");
	}
}
public class Superkeyword6 
{
	public static void main(String[] args) 
	{
		new Child6();
	}
}
//using super keyword we can call constructor of the parent class but it should be the first statement inside child class constructor
