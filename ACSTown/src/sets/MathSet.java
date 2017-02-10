package sets;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.*;

public class MathSet
{
	
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		String[] temp = o.split(" ");
		String[] tempp = t.split(" ");
		for(String s: temp)
			one.add(Integer.parseInt(s));
		for(String s: tempp)
			two.add(Integer.parseInt(s));
	}

	public Set<Integer> union()
	{
		Set<Integer> returnSet = new TreeSet<Integer>();
		returnSet.addAll(one);
		returnSet.addAll(two);
		return returnSet;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> returnSet = new TreeSet<Integer>();
		returnSet.addAll(one);
		returnSet.retainAll(two);
		return returnSet;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> returnSet = new TreeSet<Integer>();
		returnSet.addAll(one);
		returnSet.removeAll(two);
		return returnSet;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> returnSet = new TreeSet<Integer>();
		returnSet.addAll(two);
		returnSet.removeAll(one);
		return returnSet;
	}
	
	public Set<Integer> symmetricDifference()
	{	
		Set<Integer> returnSet = new TreeSet<Integer>();
		returnSet.addAll(differenceBMinusA());
		returnSet.addAll(differenceAMinusB());
		return returnSet;
	}	
	
	public String toString()
	{
		String s = "Set one " + one + "\n" +	"Set two " + two +  "\n\n";
		s += "Union: " + union() + "\n";
		s += "Intersection: " + intersection() + "\n";
		s += "B-A: " + differenceBMinusA() + "\n";
		s += "A-B: " + differenceAMinusB() + "\n";
		s += "Sym Difference: " + symmetricDifference() + "\n";
		return s;
	}
}