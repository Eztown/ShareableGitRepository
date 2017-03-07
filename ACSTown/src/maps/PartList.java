package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();
	}
	
	public PartList(String fileName)
	{
		this();
		partsMap = new TreeMap<Part, Integer>();
		try
		{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()){
				String s = file.nextLine();
				if(partsMap.containsKey(new Part(s)))
					partsMap.put(new Part(s), partsMap.get(new Part(s))+1);
				else
					partsMap.put(new Part(s), 1);
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	
	public String toString()
	{
		String output="";
			for(Part p : partsMap.keySet())
				output+=p.toString()+" "+partsMap.get(p)+"\n";
		return output;
	}
}