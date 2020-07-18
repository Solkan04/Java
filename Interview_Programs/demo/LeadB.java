package demo;

class Test
{
	static Test obj=null;
	static Test getInstance()
	{
		if(obj==null)
			obj=new Test();
		return obj;
	}
	private Test()
	{
		System.out.println();
	}
	void addition(int x, int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
public class LeadB 
{
	public static void main(String[] args) 
	{
		Test t1=Test.getInstance();
		t1.addition(3, 4);
	}
	
}
