package linkedList;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
			for(int a : list)
				total+=a;
		return total;
	}

	public double getAvg(  )
	{
		return getSum()/list.size();
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
			for(int a : list)
				if(a>largest)
					largest=a;
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		for(int a : list)
			if(a<smallest)
				smallest=a;
		return smallest;
	}

	public String toString()
	{
		return list.toString()+"\n"+"Average/Max/Min\n"+getAvg()+"/"+getLargest()+"/"+getSmallest()+"\n\n";
	}
}