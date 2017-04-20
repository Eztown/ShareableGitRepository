package linkedList;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   String re = "";
	   
	   while(list.getNext()!=null){
		   re += list.getValue()+", "; 
		   list = list.getNext();
	   }
	   
	   re += list.getValue(); 
	  
	  System.out.println(re);
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count=0;
		while(list.getNext()!=null){
			count+=1;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		list.setNext(new ListNode(list.getValue(), list.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode walk = list;
		while(walk.getNext()!=null)
			walk = walk.getNext();
		walk.setNext(new ListNode(walk.getValue(),null));
	}
	
	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		
	}	

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		
	}
}