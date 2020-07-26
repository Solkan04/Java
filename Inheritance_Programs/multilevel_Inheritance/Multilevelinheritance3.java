package multilevel_Inheritance;
//Multilevel inheritance with static variable
class Grandfather3
{
	static int i=10;
}
class Father3 extends Grandfather3
{
	static int j=20;
}
class ChildMI3 extends Father3
{
	static int k=30;
}
public class Multilevelinheritance3 
{
	public static void main(String[] args) 
	{
		System.out.println(ChildMI3.k);
		System.out.println(ChildMI3.j);
		System.out.println(ChildMI3.i);
	}
}
