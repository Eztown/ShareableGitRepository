package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new HashMap<String, Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if(map.containsKey(personRelative[0])){
			Set<String> s = new TreeSet<String>(map.get(personRelative[0]));
			s.add(personRelative[1]);
			map.put(personRelative[0], s);
		}
		else{
			Set<String> sa = new TreeSet<String>();
			sa.add(personRelative[1]);
			map.put(personRelative[0], sa);
		}
	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output="";
			for(String s: map.keySet())
				output+=s+" is related to "+map.get(s).toString().substring(1,map.get(s).toString().toString().length()-1)+"\n";
		return output;
	}
}