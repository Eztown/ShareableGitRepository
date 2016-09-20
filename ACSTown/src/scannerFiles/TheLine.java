package scannerFiles;

import java.util.Scanner;

public class TheLine
{
   private String line;
   Scanner scan;

   public TheLine()
   {
   }

   public TheLine(String s)
   {
	   line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		int temp = 0;
		scan = new Scanner(line);
		while(scan.hasNext()){
			temp = scan.nextInt();
			if(temp>largest)
				largest=temp;
		}
		return largest;
	}

	public String toString( )
	{
		return getLargest()+" is the largest value in the string " + line;
	}
}