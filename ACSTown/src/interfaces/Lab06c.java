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

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
		Set<Person> people = new TreeSet<Person>();
	   Scanner scan = new Scanner(new File("lab06c.dat"));
	   while(scan.hasNext()){
		   String[] temp = scan.nextLine().split(" ");
		   people.add(new Person(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),temp[3]));
	   }
	   System.out.println(people);
	}
}