package hashTable;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
		int i = obj.hashCode();
		LinkedList temp = table[i];
			
		if(table[i]==null){
			table[i] = new LinkedList();
		}
		
		if(!table[i].contains(obj))
			table[i].add(obj);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
			for(int a = 0; a<table.length; a++)
				output += a+". "+table[a].toString()+"\n";
		return output;
	}
}