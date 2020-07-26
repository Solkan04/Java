package assignment5;
import java.util.TreeSet;
public class TreeSet_ModifyValue_to_array 
{
	public static void main(String[] args) 
	{
		TreeSet<String> oSet=new TreeSet<String>();
		oSet.add("Mercury");
		oSet.add("Mercury");
		oSet.add("Venus");
		oSet.add("Earth");
		oSet.add("Mars");
		System.out.println(oSet);
		System.out.println("**************");
		Object arr[]=oSet.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] =:"+arr[i]);
		}
	}
}
