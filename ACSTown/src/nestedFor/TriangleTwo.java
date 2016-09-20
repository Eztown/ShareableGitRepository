package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		size = sz;
		letter = let;
		toString();
	}

	public String getTriangle()
	{
		String result = "";
		for(int a = size; a!=0; a--){
			for(int b = 0; b!=a; b++){
				result += letter;
			}
			result += "\n";
		}
		return result;
	}

	public String toString()
	{
		String output= getTriangle();;
		return output;
	}
}