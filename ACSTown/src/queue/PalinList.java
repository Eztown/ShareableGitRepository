package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public void setList(String list)
	{
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		Scanner scan = new Scanner(list);
		while(scan.hasNext()){
			String temp = scan.next();
			stack.push(temp);
			queue.add(temp);
		}
	}

	public boolean isPalin()
	{
		String sTemp = "", qTemp = "";
		while(!stack.isEmpty()){
			sTemp += stack.pop();
			qTemp += queue.poll();
		}
		return qTemp.equals(sTemp);
	}


	public String toString(){
		return stack + " is " + (isPalin()?"a palinlist":"not a palinlsit");
	}
}