package arrays;

import java.util.Arrays;

public class LargestNumberInAnArrayBySorting 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2};
		Arrays.sort(a);  
		System.out.println("Largest Number is : "+a[a.length-1]);  
	}
}
