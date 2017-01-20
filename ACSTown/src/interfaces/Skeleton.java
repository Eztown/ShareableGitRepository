package interfaces;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	int size;
	String name;
	
	public Skeleton(String n, int s){
		size = s;
		name = n;
	}
	
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		return size>other.getHowBig()?true:false;
	}

	public boolean isSmaller(Monster other) {
		return size<other.getHowBig()?true:false;
	}

	public boolean namesTheSame(Monster other) {
		return name.equals(other.getName())?true:false;
	}

}