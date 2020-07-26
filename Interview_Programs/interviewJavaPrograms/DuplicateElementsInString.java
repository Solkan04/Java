package interviewJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInString 
{
	public static void main(String[] args) 
	{
		//Using 2 for loop
		String names[]={"appa","amma","anna","akka","appa"};
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate elements is : "+names[i]);
				}
			}
		}
		//Using collection HashSet
		Set<String> oSet=new HashSet<String>();
		for(String name : names)
		{
			if(oSet.add(name)==false)
			{
				System.out.println("Duplicate elements is Using collection : "+name);
			}
		}
		
	}

}
