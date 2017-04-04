package stacks;
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

public class IntStack
{
	//option 2
	private ArrayList<Integer> lints;

	public IntStack()
	{
		lints = new ArrayList<Integer>();
	}

	public void push(int item)
	{
		lints.add(item);
	}

	public int pop()
	{
		return lints.remove(lints.size()-1);
	}

	public boolean isEmpty()
	{
		return lints.isEmpty();
	}

	public int peek()
	{
		return lints.get(lints.size()-1);
	}

	public String toString()
	{
		return lints.toString();
	}
}