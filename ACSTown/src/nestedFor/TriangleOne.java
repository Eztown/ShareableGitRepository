package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
		int a = 1;
		while(a!=size){
			for(int b = 0; b<a; b++){
				output+=let;
			}
			a++;
			output+="\n";
		}
		return output;
	}
}