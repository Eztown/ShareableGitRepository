package scannerChopper;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class Average
{
   private String line;
   Scanner scan;

   public Average()
   {
	   setLine("");
	   scan = new Scanner(line);
   }

   public Average(String s)
   {
	   setLine(s);
	   scan = new Scanner(line);
   }

	public void setLine(String s)
	{
		line = s;
		scan = new Scanner(line);
	}

	public int getCount()
	{
		int count=0;
		while(scan.hasNext()){
			count+=1;
			scan.nextInt();
		}
		return count;
	}


	public int getSum()
	{
		int sum=0;
		while(scan.hasNext()){
			sum+=scan.nextInt();
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum();
		setLine(getLine());
		average = average/getCount();
		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return "Average: "+getAverage();
	}
}