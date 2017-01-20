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
import static java.lang.System.*;

public class OddEvenSets
{
	Set<Integer> odds;
	Set<Integer> evens;

	public OddEvenSets()
	{
	}

	public OddEvenSets(String line)
	{
		Scanner scan = new Scanner(line);
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
		while(scan.hasNext()){
			int a = scan.nextInt();
			if(a%2==0)
				evens.add(a);
			else
				odds.add(a);
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}