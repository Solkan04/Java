package assignment5;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet_AddValues_Add_to_Another_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> oSet1=new TreeSet<String>();
		oSet1.add("Mercury");
		oSet1.add("Venus");
		oSet1.add("Earth");
		oSet1.add("Mars");
		System.out.println(oSet1);
		System.out.println("*********************");
		//Add one TReeSet to Another TreeSet
		TreeSet<String> oSet2=new TreeSet<String>();
		oSet2.add("Jupiter");
		oSet2.add("Saturn");
		oSet2.add("Uranus");
		oSet2.add("Neptune");
		System.out.println(oSet2);
		System.out.println("*********************");
		//add oSet2 to Oset1
		oSet1.addAll(oSet2);
		System.out.println(oSet1);
		System.out.println("************************");
		//display using for each
		for(String str:oSet1)
		{
			System.out.println("for each :"+str);
		}
		System.out.println("*********************");
		//display using Iterator
		Iterator<String> oIte=oSet1.iterator();
		while(oIte.hasNext())
		{
			System.out.println("Iterator :"+oIte.next());
		}
	}
}