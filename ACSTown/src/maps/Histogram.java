package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String, Integer>();
	}

	public void setSentence(String s)
	{
		String[] bits = s.split(" ");
		for(String a : bits)
			if(histogram.containsKey(a))
				histogram.put(a, histogram.get(a)+1);
			else
				histogram.put(a, 1);
	}

	public String toString()
	{
		String output="";
		for(String s : histogram.keySet()){
			output+=s+"\t";
			for(int a = 0; a<histogram.get(s); a++)
				output+="*";
			output+="\n";
		}
			
		return output+"\n\n";
	}
}