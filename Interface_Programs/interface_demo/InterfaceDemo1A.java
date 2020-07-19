package interface_demo;
//When to go for interface:If all the child class requires different behaviors from different parent classes then we go for interface
interface Actor
{
	void actorname();
	void nooffilmsacted();
}
interface Director
{
	void directorname();
	void nooffilmsdir();
}
interface Hospital
{
	void noofbeds();
	void noofdoctors();
}
interface Hotel
{
	void typeofhotel();
	void noofdishes();
}
class Puneeth implements Actor,Director1
{
	public void actorname()
	{
		System.out.println("The actor name is Puneeth");
	}
	public void nooffilmsacted()
	{
		System.out.println("Acted in 200+ movies");
	}
	public void directorname()
	{
		System.out.println("Director name is Puneeth");
	}
	public void nooffilmsdir()
	{
		System.out.println("Directed around 20+ movies");
	}
	@Override
	public void directorName() {
		// TODO Auto-generated method stub
		
	}
}
class BGSHospital implements Hospital
{
	public void noofbeds()
	{
		System.out.println("No of beds: 100");
	}
	public void noofdoctors()
	{
		System.out.println("No of Doctors: 80");
	}
}
public class InterfaceDemo1A 
{
	public static void main(String[] args) 
	{
		Puneeth p=new Puneeth();
		p.actorname();
		p.directorname();
		p.nooffilmsacted();
		p.nooffilmsdir();
		System.out.println("***********************");
		BGSHospital h=new BGSHospital();
		h.noofbeds();
		h.noofdoctors();
	}

}
