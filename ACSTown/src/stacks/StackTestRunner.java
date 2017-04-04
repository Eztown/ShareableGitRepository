package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		StackTest test = new StackTest("A B C D E F G H I");
		System.out.println(test);
		test.setStack("1 2 3 4 5 6 7 8 9");
		System.out.println(test);
	}
}
