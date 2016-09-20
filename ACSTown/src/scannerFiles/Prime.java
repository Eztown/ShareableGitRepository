package scannerFiles;

public class Prime
{
	private int number;

	public Prime(){
		
	}
	
	public Prime(int num){
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime(){
		for(int a = number/2; a>1; a--)
			if(number%a==0)
				return false;
		return true;
	}

	public String toString()
	{
		return number+(isPrime()?" is prime":" is not prime");
	}
}