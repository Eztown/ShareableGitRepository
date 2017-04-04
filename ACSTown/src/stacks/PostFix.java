package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression, c;

	public PostFix()
	{
		stack = new Stack<Double>();
		c = "+-*/";
	}

	public void setExpression(String exp)
	{
		expression = exp;
	}

	public double calc(double one, double two, char op)
	{
		double value = 0.0;
		switch(op){
			case '+':
				value = one+two;
				break;
			case '-':
				value = two-one;
				break;
			case '*':
				value = one*two;
				break;
			case '/':
				value = two/one;
				break;
		}
		return value;
	}

	public void solve()
	{
		Scanner scan = new Scanner(expression);
		while(scan.hasNext()){
			String t = scan.next();
			if(c.indexOf(t)>-1)
				stack.push(calc(stack.pop(), stack.pop(), t.charAt(0)));
			else
				stack.push(Double.parseDouble(t));
		}
	}

	public String toString(){
		solve();
		return expression + " is " + stack.pop();
	}
}