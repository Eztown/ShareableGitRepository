package queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList pL = new PalinList();
		try {
			Scanner scan = new Scanner(new File("palinList.txt"));
			while(scan.hasNextLine()){
				pL.setList(scan.nextLine());
				System.out.println(pL);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
	}
}