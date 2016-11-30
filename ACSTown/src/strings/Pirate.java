package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pirate {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("pirate.txt"));
			while(scan.hasNextLine()){
				System.out.println(piritize(scan.nextLine()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String piritize(String l) throws Exception{
		Scanner translater = new Scanner(new File("translate.txt"));
		String line = l;
		while(translater.hasNext()){
			String temp = translater.nextLine();
			String replace = temp.substring(0,temp.indexOf(" "));
			String replacer = temp.substring(temp.lastIndexOf(" ")+1);
			line = line.replaceAll(replace, replacer);
		}
		return line;
	}

}
