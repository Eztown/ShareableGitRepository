package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		setStack("");
	}

	public StackTest(String line)
	{
		stack = new Stack<String>();
		setStack(line);
	}
	
	public void setStack(String line)
	{
		Scanner scan = new Scanner(line);
		while(scan.hasNext())
			stack.push(scan.next());
	}

	public String toString(){
		String re = "";
		re += stack + "\n";
		while(!stack.empty())
			re += stack.pop()+", ";
		return re;
	}
}