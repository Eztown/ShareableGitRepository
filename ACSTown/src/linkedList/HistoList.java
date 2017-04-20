package linkedList;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void add(char let)
	{
		if(front!=null){
		boolean inList = false;
		HistoNode walk = front;
		while(walk.getNext()!=null){
			if(walk.getLetter()==let){
				walk.setLetterCount(walk.getLetterCount()+1);
				inList = true;
			}
			walk = walk.getNext();
		}
		if(!inList)
			front = new HistoNode(let,1,front);
		}
		
		else
			front = new HistoNode(let,1,null);
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		int a = -1;
		HistoNode walk = front;
		while(walk.getNext()!=null){
			if(walk.getLetter()==let){
				return a;
			}
			walk = walk.getNext();
			a++;
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=front;
		for(int a = spot; a>0; a++)
			current.getNext();
		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		HistoNode walk = front;
		while(walk.getNext()!=null){
			output+=front.getLetter()+" "+front.getLetterCount()+", ";
			walk = walk.getNext();
		}
		return output;
	}
}