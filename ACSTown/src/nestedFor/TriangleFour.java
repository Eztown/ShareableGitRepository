package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
	}

	public TriangleFour(int count, String let)
	{
		setTriangle(let, count);
		toString();
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a<=size; a++){
			for(int b =(size-a); b<size; b++){
				output+=" ";
			}
			for(int c = size-(size-a); c<size; c++){
				output+=letter;
			}
			output+="\n";
		}
		return output;
	}
}