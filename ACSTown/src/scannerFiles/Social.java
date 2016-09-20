package scannerFiles;

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
		String[] dividedNums = socialNum.split("-");
		for(int a = 0; a<dividedNums.length;a++){
			sum+=Integer.parseInt(dividedNums[a]);
		}
		return sum;
	}

	public String toString()
	{
		return getSum()+" is the total of the SSID "+socialNum;
	}
}