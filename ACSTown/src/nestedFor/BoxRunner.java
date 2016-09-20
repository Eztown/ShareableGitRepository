package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.out;

import java.util.Scanner;

public class BoxRunner
{
   public static void main( String args[] )
   {
	   int count;
	   Scanner scan = new Scanner(System.in);
	   
	   out.println("Please enter a size:");
	   count = scan.nextInt();
	   
	   Box test = new Box(count);
	   System.out.println(test);
	}
}