package simple_Inheritance;
//simple inheritance with non-static variable
class Parent1
{
	int i;//non-static variable
}
public class Inheritance1 extends Parent1
{
	int j=10;//non static variable
	public static void main(String[] args) 
	{
		Inheritance1 obj=new Inheritance1();
		System.out.println(obj.i);//"i" is inherited from parent1 class
		System.out.println(obj.j);//"j" is not inherited
	}
}
