package inheritance;
//Accessing static variable with reference
class Sample6
{
	public static void test()
	{
		System.out.println("Test");
	}
}
public class G extends Sample6
{
	public static void main(String[] args) 
	{
		G g=new G();
		g.test();//Compiler automatically converts from "g.test()" to "Sample6.test()"
	}
}
//Output is "Test" with a warning
