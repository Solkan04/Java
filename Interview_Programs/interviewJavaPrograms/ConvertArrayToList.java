package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayToList 
{
	public static void main(String[] args) 
	{
		String arr[]={"Sharanu","Gubbi"};
		
		List<String> oList=new ArrayList<String>();
		oList=Arrays.asList(arr);
		
		for (String string : oList)
		{
			System.out.println(string);
			/*Iterator<String> it=oList.iterator();
			while(it.hasNext())
			System.out.println(it.next());	*/

		}
		
		
	}

}
