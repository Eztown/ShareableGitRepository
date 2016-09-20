package scannerFiles;

import java.io.File;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.util.Scanner;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("primes.dat"));
		Prime primer;
		while(scan.hasNextLine()){
			primer = new Prime(Integer.parseInt(scan.nextLine()));
			System.out.println(primer.toString());
		}
	}
}