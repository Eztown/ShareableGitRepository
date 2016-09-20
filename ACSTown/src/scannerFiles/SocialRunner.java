package scannerFiles;

import java.io.File;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("social.dat"));
		Social adder;
		int lineTotal = file.nextInt();
		file.nextLine();
		for(int a = 0; a<lineTotal; a++){
			adder = new Social(file.nextLine());
			System.out.println(adder.toString());
		}
	}
}