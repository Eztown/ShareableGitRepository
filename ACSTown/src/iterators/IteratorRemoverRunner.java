package iterators;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		IteratorRemover r = new IteratorRemover("r r r j j r a r e a d a d", "r");
		r.remove();
		System.out.println(r);
	}
}