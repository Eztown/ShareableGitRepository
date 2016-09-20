package nestedFor;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class TriangleFive
{
   private int letter;
   private int amount;
   String output=" ";

	public TriangleFive()
	{
	}

	public TriangleFive(int let, int amt)
	{
		setLetter(let);
		setAmount(amt);
		toString(amount);
	}

	public void setLetter(int let)
	{
		letter = let;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString(int a)
	{
		int run = a;
		if(run!=0){
		for(int b = 0; b<=amount; b++){
		for(int c = 0; c<=amount; c++){
		output+=(char)(letter+b);
		}
		output+=" ";
		}
		return toString(run--);
		}
		else
		return output;
	}
}