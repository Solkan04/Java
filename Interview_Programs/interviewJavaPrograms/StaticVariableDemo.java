package interviewJavaPrograms;
class College
{
	String name;
	int rollno;
	static String  college="City college";
	College(String n,int r)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(name+" "+rollno+" "+college);
	}
}
public class StaticVariableDemo 
{
	public static void main(String[] args) 
	{
		College col=new College("Sharanu", 10);
		col.display();
		
	}

}
