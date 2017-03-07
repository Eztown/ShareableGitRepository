package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new HashMap<String, String>();
	}

	public void putEntry()
	{
		Scanner scan = new Scanner("");
		try {
			scan = new Scanner(new File("FtEC.txt"),"unicode");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()){
			String[] s = scan.nextLine().split(",");
			pairs.put(s[0],s[1]);
		}
	}

	public String translate(String sent)
	{
		String[] bits = sent.split(" ");
		String output ="";
		
		for(int a = 0; a<bits.length; a++)
			output += pairs.get(bits[a].toLowerCase())+" ";
		
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}