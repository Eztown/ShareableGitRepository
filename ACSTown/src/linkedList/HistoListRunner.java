package linkedList;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class HistoListRunner
{
	public static void main(String[] args)
	{
		//A A A A B V S E A S A A
		HistoList test = new HistoList();
		test.add('A');
		test.add('A');
		test.add('A');
		test.add('A');
		test.add('B');
		test.add('V');
		test.add('S');
		test.add('E');
		test.add('A');
		test.add('S');
		test.add('A');
		test.add('A');
		System.out.println(test);


		//A B C
		test = new HistoList();
		test.add('A');
		test.add('B');
		test.add('C');
		System.out.println(test);


		//A B C A B C A B C A B C A B C
		test = new HistoList();
		test.add('A');
		test.add('B');
		test.add('C');
		test.add('A');
		test.add('B');
		test.add('C');
		test.add('A');
		test.add('B');
		test.add('C');
		test.add('A');
		test.add('B');
		test.add('C');
		test.add('A');
		test.add('B');
		test.add('C');
		System.out.println(test);
	}
}