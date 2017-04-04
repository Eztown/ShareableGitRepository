package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;
	String openC, closeC;

	public SyntaxChecker()
	{
		exp = "";
		openC = "<{[(";
		closeC = ">}])";
		symbols = new Stack<Character>();
	}

	public SyntaxChecker(String s)
	{
		exp = s;
		openC = "<{[(";
		closeC = ">}])";
		symbols = new Stack<Character>();
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
		Boolean response = true;
		for(int a = 0; a<exp.length(); a++){
			char temp = exp.charAt(a);
			if(openC.indexOf(temp)>-1)
				symbols.push(closeC.charAt(openC.indexOf(temp)));
			if(closeC.indexOf(temp)>-1)
				if(temp == symbols.peek())
					symbols.pop();
				else{
					response = false;
				}
		}
		return response;
	}

	public String toString(){
		return exp + " is " + (checkExpression()?"valid":"invalid");
	}
}