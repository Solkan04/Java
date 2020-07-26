package interviewJavaPrograms;

class Bank
{
	String bankName="HDFC";
	private int acctNumber;
	void setAcctNumber(int acct)
	{
		acctNumber=acct;
		System.out.println(bankName);
	}
	int getAcctNum()
	{
		return acctNumber;
	}
}
public class EncapsulationDemo 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setAcctNumber(1245862);
		System.out.println(b.getAcctNum());
		
	}

}
