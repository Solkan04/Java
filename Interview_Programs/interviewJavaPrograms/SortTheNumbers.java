package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheNumbers 
{
	public static void main(String[] args) 
	{
		int [] arr={9,8,7,6,5,4,3,2,1};
		List<Integer> oList= new ArrayList<Integer>();
		for(int a:arr)
		oList.add(Integer.valueOf(a));
		{
			Collections.sort(oList);
			for(int i=0;i<oList.size();i++)
			{
				System.out.println("Sorted number is : "+oList.get(i));
			}
		}		
	}

}
