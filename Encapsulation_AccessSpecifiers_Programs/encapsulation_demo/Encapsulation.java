package encapsulation_demo;

class Sample 
{
	private int salary;
	void setPrivate(int salary) 
	{
		this.salary = salary;
	}
	int getPrivate() 
	{
		return salary;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.setPrivate(90000);
		int res = s1.getPrivate();
		System.out.println(res);
	}
}
