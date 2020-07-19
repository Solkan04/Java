package constructor_demo;
class Human
{
	String Firstname;
	String Lastname;
	int age;
}
public class Humandemo 
{
	public static void main(String[] args) 
	{
		Human modi=new Human();
		modi.Firstname="Narendra";
		modi.Lastname="Modi";
		modi.age=65;
		System.out.println("Firstname: " +modi.Firstname);
		System.out.println("Lastame: " +modi.Lastname);
		System.out.println("Age: " +modi.age);
		System.out.println("******************************");
		
		Human bhagat=new Human();
		bhagat.Firstname="Bhagath";
		bhagat.Lastname="Singh";
		bhagat.age=25;
		System.out.println("Firstname: " +bhagat.Firstname);
		System.out.println("Lastname: " +bhagat.Lastname);
		System.out.println("Age: " +bhagat.age);
		System.out.println("###############################");
	}
}
