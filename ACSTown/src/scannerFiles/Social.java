package scannerFiles;

import java.util.Scanner;

public class Social
{
   private String socialNum;

	public Social()
	{
	}

	public Social(String soc)
	{
		socialNum = soc;
	}

	public void setSocial(String soc)
	{
		socialNum = soc;
	}

	public int getSum()
	{
		int sum = 0;
		Scanner scan = new Scanner(socialNum);
		scan.useDelimiter("-");
		while(scan.hasNext())
			sum+=scan.nextInt();
		return sum;
	}

	public String toString()
	{
		return getSum()+" is the total of the SSID "+socialNum;
	}
}