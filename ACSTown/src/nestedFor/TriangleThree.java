package nestedFor;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree(String let, int count)
	{
		size = count;
		letter = let;
		toString();
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a<=size; a++){
			for(int b = size-(size-a); b<size; b++){
				output+=" ";
			}
			for(int c = a; c!=0; c--){
				output+=letter;
			}
			output+="\n";
		}
		return output+"";
	}
}