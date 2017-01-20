package interfaces;
//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster2Runner
{
   public static void main( String args[] )
   {
		Monster2 zero = new Monster2();
		Monster2 one = new Monster2(8);
		Monster2 sue = new Monster2(9, 4);
		Monster2 harry = new Monster2(1, 2, 3);
		out.println("\nZero Monster2 :: " + zero);		
		out.println("\nOne Monster2 :: " + one);
		out.println("\nSue Monster2 :: " + sue);
		out.println("\nHarry Monster2 :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster2 :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monster2)harry.clone();
		out.println("\nsue Monster2 :: " + sue);

		Monster2 mOne = new Monster2(33,33,11);
		Monster2 mTwo = new Monster2(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}