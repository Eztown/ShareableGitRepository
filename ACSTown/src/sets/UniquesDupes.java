package sets;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		Scanner scan = new Scanner(input);
		while(scan.hasNext())
			uniques.add(scan.next());
		return uniques;
	}

	public static String getDupes(String input)
	{
		String list = "";
		Set<String> uniques = new TreeSet<String>();
		Scanner scan = new Scanner(input);
		while(scan.hasNext()){
			String temp = scan.next();
			if(!uniques.add(temp))
				list+=" "+temp;
		}
		return list;
	}
}