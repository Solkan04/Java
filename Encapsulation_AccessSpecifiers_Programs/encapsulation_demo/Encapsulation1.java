package encapsulation_demo;
class Student
{
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
}
public class Encapsulation1 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setname("Mahesh");
		System.out.println(s.getname());
	}
}
