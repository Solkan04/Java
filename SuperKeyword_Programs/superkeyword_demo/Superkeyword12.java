package superkeyword_demo;
//Super keyword with parameterized constructor in parent class
class Parent12
{
	Parent12(int i)
	{
		System.out.println(i);
	}
}
class Child12 extends Parent12
{
	Child12()
	{
		super(100);
	}
}
public class Superkeyword12 
{
	public static void main(String[] args) 
	{
		new Child12();
	}
}
//when there is a Parameterized constructor in parent class then compiler will not add super keyword in child class constructor
//It is mandatory to use super keyword in child class constructor explicitly if the constructor in Parent class has parameters in it
