package sets;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("oddoreven.dat"));
		OddEvenSets m = null;
		while(scan.hasNextLine()){
		String temp = scan.nextLine();
		m = new OddEvenSets(temp);
		System.out.println(m);	
		}
	}
}