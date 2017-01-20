package interfaces;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class VowelWordRunner {
	public static void main(String args[])  {
		String names1 = "freddy at elephant whoooooodat alice tommy bobby it at about";
		Scanner scan = new Scanner(names1);
		
		VowelWord[] words1 = new VowelWord[10];
		int i = 0;
		while (scan.hasNext()) {
			words1[i] = new VowelWord(scan.next());
			i++;
		}
		
		System.out.println("before sorted: ");
		for (VowelWord word : words1) {
			out.println(word);
		}
		System.out.println();
		
		System.out.println("after sorted: ");
		Arrays.sort(words1);
		for (VowelWord word : words1) {
			out.println(word);
		}
	}
}