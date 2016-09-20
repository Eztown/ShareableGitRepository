package scannerChopper;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineBreaker
{
   private String line;
   private int breaker;
   Scanner scan;

   public LineBreaker()
   {
   	this("",0);
   	scan = new Scanner(line);
   }

   public LineBreaker(String s, int b)
   {
	   line = s;
	   breaker = b;
	   scan = new Scanner(line);
   }

	public void setLineBreaker(String s, int b)
	{
		line = s;
		breaker = b;
		scan = new Scanner(line);
	}

	public String getLine()
	{
		return line;
	}

	public String getLineBreaker()
	{
		String box ="";
		int index = 0;
		while(scan.hasNext()){
			if(index!=breaker){
				index++;
				box+=scan.next();
			}
			else{
				index = 0;
				box+="\n";
			}
		}
		return box;
	}

	public String toString()
	{
		return line+"\n"+getLineBreaker();
	}
}