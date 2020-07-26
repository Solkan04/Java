package interviewJavaPrograms;

public class Array_Copy_To_Another_Array 
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.println("Source Array is "+a[i]+ "  Destination Array is "+b[i]);
			/*System.arraycopy(a, 0, b, 0, 5);
			System.out.println("Source Array is "+a[i]+ "  Destination Array is "+b[i]);*/
		}
		
	}
	
}
