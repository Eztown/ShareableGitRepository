package scannerChopper;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class OddEvenCounter
{
	private String line;
	Scanner scan;

   public OddEvenCounter()
   {
	   scan = new Scanner(line);
   }

   public OddEvenCounter(String s)
   {
	   line = s;
	   scan = new Scanner(line);
   }

	public void setLine(String s)
	{
		line = s;
		scan = new Scanner(line);
	}

	public int getEvenCount()
	{
		int count= 0;
		scan = new Scanner(line);
		while(scan.hasNext())
			if(scan.nextInt()%2==0)
				count++;
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
		scan = new Scanner(line);
		while(scan.hasNext())
			if(scan.nextInt()%2==1)
				count++;
		return count;
	}

	public String toString( )
	{
		return "Odd: "+getOddCount()+", Even: "+getEvenCount();
	}
}