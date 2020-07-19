package interface_demo;
//Multiple inheritance using more than two interfaces
interface A1
{
	void BatsmanName();
}
interface A2
{
	void BowlerName();
}
interface A3
{
	void KeeperName();
}
class Cricket implements A1,A2,A3
{
	public void BatsmanName()
	{
		System.out.println("Batsman Name is: Dravid");
	}
	public void BowlerName()
	{
		System.out.println("Bowler Name is: Muralitharan");
	}
	public void KeeperName()
	{
		System.out.println("Keeper Name is: MS Dhoni");
	}
}
public class InterfaceDemo11 
{
	public static void main(String[] args) 
	{
		Cricket ckt=new Cricket();
		ckt.BatsmanName();
		ckt.BowlerName();
		ckt.KeeperName();
	}
}
