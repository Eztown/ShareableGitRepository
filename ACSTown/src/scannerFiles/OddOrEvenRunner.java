package scannerFiles;

import java.io.File;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.util.Scanner;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddoreven.dat"));
		OddOrEven checker;
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();
		   checker = new OddOrEven(num);
		   System.out.println(checker.toString());
		}
	}
}