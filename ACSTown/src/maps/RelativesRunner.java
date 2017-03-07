package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Relatives re = new Relatives();
		Scanner scan = new Scanner(new File("relatives.dat"));
		while(scan.hasNextLine())
			re.setPersonRelative(scan.nextLine());
		System.out.println(re.toString());
	}
}