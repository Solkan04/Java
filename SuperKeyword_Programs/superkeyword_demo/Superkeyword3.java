package superkeyword_demo;
//Super keyword with static method
class Parent3
{
	int i=10;
}
public class Superkeyword3 extends Parent3
{
	public static void main(String[] args) 
	{
		//System.out.println(super.i);//error
		System.out.println("Cannot use Super keyword in a static method");
	}
}
