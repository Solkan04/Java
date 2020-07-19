package interface_demo;
//Describe Multiple Inheritance using one super class & more than one interface
interface Batsman
{
	void BatsmanName();
}
interface Bowler
{
	void BowlerName();
}
class Allrounder
{
	public void AllrounderName()
	{
		System.out.println("The Allrounder Name is: Hardik Pandya");
	}
}
class Cricket1 extends Allrounder implements Batsman,Bowler
{
	public void BatsmanName()
	{
		System.out.println("The Batsman Name is: Virat Kohli");
	}
	public void BowlerName()
	{
		System.out.println("The Bowler Name is: Dale Steyn");
	}
}
public class InterfaceDemo13 
{
	public static void main(String[] args) 
	{
		Cricket1 ckt1=new Cricket1();
		ckt1.AllrounderName();
		ckt1.BatsmanName();
		ckt1.BowlerName();
	}

}
