package interfaces;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person( int y, int m, int d, String n)
  {
	  myYear = y;
	  myMonth = m;
	  myDay = d;
	  myName = n;
  }

  public int compareTo( Person other )
  {
	 if(myYear>other.getYear())
	 return 1;
	 else if(myYear<other.getYear())
	 return -1;
	 else{
		 if(myMonth>other.getMonth())
		 return 1;
		 else if(myMonth<other.getMonth())
		 return -1;
		 else{
				 if(myDay>other.getDay())
				 return 1;
				 else if(myDay<other.getDay())
				 return -1;
				 else
					 return myName.compareTo(myName);
			 } 
	 }
  	 
  }
  
  int getYear(){
	return myYear;  
  }
  
  int getMonth(){
	return myMonth;
  }
  
  int getDay(){
	return myDay;
  }
  
  String getName(){
	  return myName;
  }

  public String toString( )
  {
     return myName + ": " + myYear + " " + myMonth + " " + myDay;
  }
}