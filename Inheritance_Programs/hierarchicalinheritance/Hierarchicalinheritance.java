package hierarchicalinheritance;
//Hierarchical inheritance with non static variable
class Parent
{
	int i=10;
}
class Son extends Parent
{
	int j=20;
}
class Daughter extends Parent
{
	int k=30;
}
public class Hierarchicalinheritance 
{
	public static void main(String[] args) 
	{
		Daughter d=new Daughter();
		System.out.println(d.i);
		System.out.println(d.k);
		Son s=new Son();
		System.out.println(s.i);
		System.out.println(s.j);
	}
}
