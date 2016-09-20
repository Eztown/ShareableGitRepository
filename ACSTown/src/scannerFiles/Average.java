package scannerFiles;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class Average
{
   private String line;

   public Average(){
	   
   }
   
   public Average(String l){
	   line = l;
   }

   public void setLine(String l){
	   line = l;
   }
   
	private int getLowest()
	{
		int lowest=Integer.MAX_VALUE;
		Scanner scan = new Scanner(line);
		while(scan.hasNext()){
			int temp = scan.nextInt();
			if(temp<lowest)
				lowest = temp;
		}
		return lowest;
	}

	public double getAverage()
	{
		double average=0.0, total = 0;
		Scanner scan = new Scanner(line);
		while(scan.hasNext()){
		total++;
		average+=scan.nextInt();
		}
		return (average-getLowest())/total;
	}

	public String getLine(){
		return line;
	}

	public String toString(){
		return "The average of "+line+" is: "+getAverage();
	}




}