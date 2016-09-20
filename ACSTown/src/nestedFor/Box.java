package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Box
{
   private int size;

	public Box()
	{
	}

	public Box(int count)
	{
		setSize(count);
		toString();
	}

	public void setSize(int count)
	{
		size = count;
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a<size; a++){
			for(int b = size-a; b>0; b--){
				output+="*";
			}
			for(int c = (size-(size-a)+1); c>0; c--){
				output+="#";
			}
			output+="\n";
		}
		return output;
	}
}