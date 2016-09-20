package scannerFiles;

import java.io.File;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.util.Scanner; 

public class TheLineRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat"));
		TheLine finder;
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
			finder = new TheLine(file.nextLine());
			System.out.println(finder.toString());
		}
	}
}