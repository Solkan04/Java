package interviewJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbersUsingCollections 
{
	public static void main(String[] args) 
	{
		int arr[]={10,10,20,30,30};
		Set<Integer> oSet=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(oSet.add(arr[i])==false)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
