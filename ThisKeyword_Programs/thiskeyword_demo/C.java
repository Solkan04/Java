package thiskeyword_demo;

public class C 
{
	int i=10;
	int j;//non-static variable is not initialized hence the default value is zero
	public static void main(String[] args) 
	{
		C c=new C();
		c.test();
	}
	public void test()
	{
		System.out.println(this.i);
		System.out.println(this.j);//if we use System.out.println(c.j) then system will throw an error b'coz if a reference is created within a method then we've to
		//use it within a method
	}
}
