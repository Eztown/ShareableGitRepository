package scannerChopper;

import java.util.Scanner;

public class LineTotaller
{
   private String line;
   Scanner scan;

	public LineTotaller()
	{
		setLine("");
		scan = new Scanner(line);
	}

	public LineTotaller(String s)
	{
		line = s;
		scan = new Scanner(line);
	}

	public void setLine(String s)
	{
		line = s;
		scan = new Scanner(line);
	}

	public int getSum()
	{
		int total = 0;
		while(scan.hasNext()){
			total+=scan.nextInt();
		}
		return total;
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