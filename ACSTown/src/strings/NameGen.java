package strings;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NameGen {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Scanner adjGet = new Scanner(new File("adjectives.dat"));
		Scanner	nounGet = new Scanner(new File("nouns.dat"));
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Hello and welcome to the name generator");
		System.out.println("Please enter your name:");
		names.add(scan.nextLine());
		System.out.println("Nice to meet you " + names.get(0));
		System.out.println("Now I want you to list 5 things, they can be anything they just have to be you");
		for(int a = 0; a<5; a++)
			names.add(scan.nextLine());
		System.out.println("Interesting... Very Interesting");
		System.out.println("Now I will make for you your secret name");
		int random = (int)(Math.random()*5)+2;
		String sName = "";
		int randomm = 0;
		for(int a = 0; a<random; a++)
			switch((int)(Math.random()*3)){
				case 0:
					sName += names.get((int)(Math.random()*5)+1)+" ";
				case 1:
					randomm = (int)(Math.random()*16);
					for(int b = 0; a< randomm; a++)
						adjGet.nextLine();
					sName += adjGet.nextLine()+" ";
					adjGet = new Scanner(new File("adjectives.dat"));
				case 2:
					randomm = (int)(Math.random()*16);
					for(int b = 0; a< randomm; a++)
						nounGet.nextLine();
					sName += nounGet.nextLine()+" ";
					nounGet = new Scanner(new File("nouns.dat"));
			}
			
			System.out.println(sName);
		} 
}
