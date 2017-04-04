package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	private ArrayList<Integer> lints;

	public IntQueue()
	{
		lints = new ArrayList<Integer>();
	}

	public void add(int item)
	{
		lints.add(item);
	}

	public int remove()
	{
		return lints.remove(lints.size()-1);
	}

	public boolean isEmpty()
	{
		return lints.isEmpty();
	}

	public int peek()
	{
		return lints.get(0);
	}

	public String toString()
	{
		return lints.toString();
	}
}