package interfaces;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	private String name, end;

	public SiteName(String n){
		name = n;
		end = n.substring(n.indexOf('.')+1);
	}
	
	String getName(){
		return name;
	}
	
	String getEnd(){
		return end;
	}
	
	public int compareTo(SiteName arg0) {
		return end.equals(arg0.getName())?name.compareTo(arg0.getName()):end.compareTo(arg0.getEnd());
	}
	
	public String toString(){
		return name;
	}
}