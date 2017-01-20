package sets;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String s = "1 2 3 3 2 3 4 4 7 7 8 2 2 3 3 3";
		UniquesDupes u = new UniquesDupes();
		System.out.println("Orginal: "+s);
		System.out.println("Uniques: "+u.getUniques(s));
		System.out.println("Dupes: " + u.getDupes(s));
	}
}