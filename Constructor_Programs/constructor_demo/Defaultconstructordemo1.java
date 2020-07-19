package constructor_demo;

class Student
{
	int rollnumber;
	String name;
	Student()
	{
		System.out.println(" " +rollnumber);//Will print default value of int
		System.out.println(" " +name);//will print default value of string
		
	}
}
public class Defaultconstructordemo1 
{
	public static void main(String[] args) 
	{
		new Student();
	}
}
