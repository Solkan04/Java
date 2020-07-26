package interviewJavaPrograms;

import java.util.HashMap;

public class CountDuplicateCharacter 
{
	public static void main(String[] args) 
	{
		String str="appailove";
		HashMap<Character, Integer> oMap=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(oMap.get(c) != null)
			{
				oMap.put(c, oMap.get(c) +1);
			}
			else
			{
				oMap.put(c, 1);
			}
		}
		System.out.println(oMap);
		
	}

}
