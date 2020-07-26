package multilevel_Inheritance;
//Multilevel inheritance with non-static variable
class Grandfather
{
	int i=10;
}
class Father extends Grandfather
{
	int j=20;
}
class Child extends Father
{
	int k=30;
}
public class Multilevelinheritance 
{
	public static void main(String[] args) 
	{
		Child ch=new Child();
		System.out.println(ch.i);
		System.out.println(ch.j);
		System.out.println(ch.k);
	}
}
