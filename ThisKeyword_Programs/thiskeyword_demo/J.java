package thiskeyword_demo;
//accessing static variable using "this" keyword
public class J 
{
	static int i;//static variable is not initialized hence the default value will be zero
	public static void main(String[] args) 
	{
		J j=new J();
		j.test();
	}
	public void test()
	{
		System.out.println(this.i);//Static variables has to be accessed with a class name[J]
		//here we've not used class name as a reference to access static variable hence we're getting a warning but still will get an output
	}
}
