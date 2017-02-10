package sets;

import java.util.*;

public class Lottery {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Set<Integer> winning = new HashSet<Integer>();
		Set<Integer> answers = new HashSet<Integer>();
		Set<Integer> correct = new HashSet<Integer>();
		System.out.println("Please enter your lotto numbers");
		for(int a = 0; a<5; a++){
			winning.add((int)(Math.random()*50+1));
			answers.add(Integer.parseInt(scan.nextLine()));
		}
		System.out.println("Your numbers are " + answers + "\nThe winning numbers were "+ winning + "\n\n");
		for(Integer a:answers)
			if(winning.contains(a)){
				correct.add(a);
			}
		
		System.out.println("Your had "+correct.size()+" correct numbers");
		System.out.println("Your correct numbers were "+correct);
	}
}
