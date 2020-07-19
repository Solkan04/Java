package thiskeyword_demo;

public class H 
{
	int i=10;
	public static void main(String[] args) 
	{
		H h1=new H();
		H h2=new H();
		h2.test();
		h1.test();
	}
	public void test()
	{
		System.out.println(this.i);
	}
}
//"this" keyword points to the current object which is executing. 
//here h2 is the first object which is executing hence "this" keyword points to h2. 
//once h2 execution is completed, h1 starts executing & then "this" keyword points to h1.
//both the objects cannot be executed at once, execution happens sequentially
