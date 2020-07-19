package constructor_demo;
class Human3
{
	String strFN;
	String strLN;
	int strage;
	Human3(String Firstname, String Lastname, int age)
	{
		strFN=Firstname;
		strLN=Lastname;
		strage=age;
		System.out.println("Firstname: " +Firstname);
		System.out.println("Lastname: " +Lastname);
		System.out.println("Age: " +age);
	}
}
public class Humandemo2 
{
	public static void main(String[] args) 
	{
		Human3 modi=new Human3("Narendra", "Modi", 65);
		System.out.println("");
		Human3 bhagat=new Human3("Bhagath", "Singh", 25);
	}
}
