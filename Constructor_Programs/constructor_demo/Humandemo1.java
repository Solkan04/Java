package constructor_demo;
class Human1
{
	String Firstname;
	String Lastname;
	int age;
	Human1()
	{
		Firstname="Narendra";
		Lastname="Modi";
		age=65;
		System.out.println("Firstname: " +Firstname);
		System.out.println("Lastname: " +Lastname);
		System.out.println("Age: " +age);
	}
}
public class Humandemo1 
{
	public static void main(String[] args) 
	{
		Human1 modi=new Human1();
		System.out.println("#################");
		Human1 bhagat=new Human1();
	}
}
//#The drawback from the above code is both the instances/objects are getting the same values because we've used
// default constructor to assign the value to instance variable
//#The default constructor can provide a specific value or behavior to one instance only...
//#If we want to provide multiple behavior to the different instances then we've to go for parameterized constructors'