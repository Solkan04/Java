package interviewJavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileUsingBufferReader 
{
	public static void main(String[] args) 
	{
		try 
		{
			
		String line;
		
		BufferedReader bf=new BufferedReader(new FileReader("D:\\CITY\\Sample.txt"));
			while((line=bf.readLine())!=null)
			{
				System.out.println(line);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
