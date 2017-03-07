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

public class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		Histogram hist = new Histogram();
		hist.setSentence("a a f a f d a f f f s f s f s f s e t");
		System.out.println(hist.toString());
	}
}