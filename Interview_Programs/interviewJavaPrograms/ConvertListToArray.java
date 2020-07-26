package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray 
{
	public static void main(String[] args) 
	{
		List<String> oList=new ArrayList<String>();
		oList.add("Ant");
		oList.add("MAven");
		oList.add("TestNG");
		
		//Adding Array
		Object[] arr=oList.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}
