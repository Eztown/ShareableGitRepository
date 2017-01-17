package iterators;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		IteratorReplacer r = new IteratorReplacer("r r r j j r a r e a d a d", "r", "Moo");
		r.replace();
		System.out.println(r);	
	}
}