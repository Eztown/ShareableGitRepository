package scannerFiles;

import java.io.File;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.util.Scanner;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("box.dat"));
		Box boxMaker;
		while(scan.hasNextLine()){
			boxMaker = new Box(scan.nextLine());
			System.out.println(boxMaker.toString());
		}
	}
}