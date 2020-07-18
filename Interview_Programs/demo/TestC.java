package demo;

class Sample
{
	private int salary;
	void setPrivate(int salary)
	{
		this.salary=salary;
	}
	int getPrivate()
	{
		return salary;
	}
}
public class TestC 
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.setPrivate(900000);
		int res=s.getPrivate();
		System.out.println(res);
	}
}
