package queue;

import java.util.Scanner;

public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		MonsterPQ p = new MonsterPQ();
		System.out.println("Please enter the number of monsters you would like to enter");
		int num = scan.nextInt();
		for(int a = 0; a<num; a++){
			int ht, wt, ag;
			System.out.println("Please enter your monsters height");
			ht = scan.nextInt();
			System.out.println("their weight");
			wt =scan.nextInt();
			System.out.println("and finally their age");
			ag = scan.nextInt();
			p.add(new Monster(ht, wt, ag));
			System.out.println("Your monster is now added to the queue");
		}
		System.out.println("Printing results");
		System.out.println(p);
	}
}