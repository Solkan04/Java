package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindMinAndMaxNumber 
{
	public static void main(String[] args) 
	{
		int [] arr={10,20,40,50,100};
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr)
			list.add(Integer.valueOf(i));
		{
			System.out.println(Collections.min(list));
			System.out.println(Collections.max(list));
			
			//below code for sorting elements
			Collections.sort(list);
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.print(" "+itr.next());
			}
		}
		
		
	}

}
