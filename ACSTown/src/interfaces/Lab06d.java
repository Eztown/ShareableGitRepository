package interfaces;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
		Set<SiteName> sites = new TreeSet<SiteName>();
		Scanner scan = new Scanner(new File("lab06d.dat"));
		while(scan.hasNext()){
			sites.add(new SiteName(scan.nextLine()));
		}
		System.out.println(sites);
	}
}
