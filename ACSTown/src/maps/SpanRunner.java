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

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		SpanishToEnglish FtE = new SpanishToEnglish();
		FtE.putEntry();
		System.out.println("Hello and welcome to the English To French Translator\n");
		while(true){
		System.out.println("Please enter your sentence to be translated");
		System.out.println(FtE.translate(scan.nextLine()));
		}
	}
}