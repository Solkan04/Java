package interviewJavaPrograms;

public class FindDuplicateNumbers 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,1,3,4,4,5,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] & i!=j)
				{
					System.out.print(" "+arr[i]);
				}
			}
		}
		
	}

}
