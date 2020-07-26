package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingString 
{
	public static void main(String[] args) 
	{
		String [] str={"D","C","B","A"};
		List<String> oList=new ArrayList<>();
		oList=Arrays.asList(str);
		Collections.sort(oList);
		for(String s:oList)
		{
			System.out.print(s);
			
		}
		System.out.println("****************************");
		Iterator<String> itr=oList.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
		
		
	}

}
