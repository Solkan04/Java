package inheritance;

class Sample8
{
	int i;
}
class Sample9 extends Sample8
{
	int j;
}
public class I extends Sample9
{
	int k;
	public static void main(String[] args) 
	{
		I i1=new I();
		System.out.println(i1.i);
		System.out.println(i1.j);
		System.out.println(i1.k);
	}
}
