package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestNumberInAnArrayUsingCollection 
{
	public static void main(String[] args) 
	{
		Integer a[]={1,2,5,6,3,2};  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		System.out.println("Second Largest Number:" +list.get(1));
	}
}
