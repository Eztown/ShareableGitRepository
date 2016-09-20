package scannerFiles;

import java.io.File;
import java.io.IOException;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class AverageRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("average.dat"));
		Average averager;
		while(scan.hasNextLine()){
			averager = new Average(scan.nextLine());
			System.out.println(averager.toString());
		}
	}
}