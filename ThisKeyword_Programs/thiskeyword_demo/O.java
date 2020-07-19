package thiskeyword_demo;
//calling constructor using "this" keyword
public class O
{
	O(int i)
	{
		this();//calls the constructor
		System.out.println(i);
	}
	O()
	{
		System.out.println("O");
	}
	public static void main(String[] args)
	{
		new O(100);
	}
}
//Using "this" keyword we can call constructor of the same class but it should be the very first statement inside the constructor[Line#7]