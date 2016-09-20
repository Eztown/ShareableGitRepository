package scannerChopper;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineCounter
{
   private String line;
   Scanner scan;

   public LineCounter()
   {
		setLine("");
		scan = new Scanner(line);
   }

   public LineCounter(String s)
   {
	   setLine(s);
	   scan = new Scanner(line);
   }

	public void setLine(String s)
	{
		line = s;
	}

	public int getCount()
	{
		int count=0;	
		while(scan.hasNext()){
			count++;
			scan.nextInt();
		}
		return count;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine();
	}
}