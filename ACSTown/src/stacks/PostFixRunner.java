package stacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PostFixRunner {
	
	public static void main (String[] args)
	{
		PostFix pf = new PostFix();
		try {
			Scanner scan = new Scanner(new File("postFix.txt"));
			while(scan.hasNextLine()){
				pf.setExpression(scan.nextLine());
				System.out.println(pf.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
