package scannerFiles;

public class OddOrEven
{
	private int number;

	public OddOrEven(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}

	public boolean isOdd( )
	{
		if(number%2==0)
			return false;
		else
			return true;
	}

	public String toString()
	{
		return number + (isOdd()? " is odd.\n":" is even.\n");
	}
}