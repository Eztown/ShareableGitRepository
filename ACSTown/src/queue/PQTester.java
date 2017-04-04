package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
	}

	public PQTester(String list)
	{
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue<String>();
		String[] temp = list.split(" ");
		for(int a = 0; a<temp.length; a++)
			pQueue.add(temp[a]);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
			output+=pQueue.poll()+" ";
		return output;		
	}

	public String toString(){
		return "toString() - " + pQueue.toString() + "\ngetMin - " + getMin() + "\ngetNatrualOrder() - "  + getNaturalOrder();
	}
}