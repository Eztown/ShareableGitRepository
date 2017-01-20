package interfaces;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	String name;

	public SiteName(String n){
		name = n;
	}
	
	String getName(){
		return name;
	}
	
	public int compareTo(SiteName arg0) {
		return name.compareTo(arg0.getName());
	}
	
	public String toString(){
		return name;
	}
}