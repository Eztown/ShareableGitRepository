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

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(new File("mathsetdata.dat"));
		while(scan.hasNextLine()){
			MathSet set = new MathSet(scan.nextLine(),scan.nextLine());
			System.out.println(set.toString());
		}
	}
}
