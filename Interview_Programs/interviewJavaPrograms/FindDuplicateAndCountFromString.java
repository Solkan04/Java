package interviewJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateAndCountFromString 
{
	public static void main(String[] args) 
	{
		String text = "S h a r a n u";

	    List<String> list = Arrays.asList(text.split(" "));

	    Set<String> uniqueWords = new HashSet<String>(list);
	    for (String word : uniqueWords) {
	        System.out.println(word + ": " + Collections.frequency(list, word));
	    }
	}

}
