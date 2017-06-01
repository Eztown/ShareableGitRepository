package hashTable;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
		try{
			HashTable h = new HashTable();			
			Scanner scan = new Scanner(new File("numbers.dat"));
			while(scan.hasNextInt())
				h.add(new Number(scan.nextInt()));
			System.out.println(h);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
			e.printStackTrace();
		}
  }
}