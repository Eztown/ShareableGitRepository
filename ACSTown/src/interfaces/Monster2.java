package interfaces;

import static java.lang.System.*;

public class Monster2 implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster2(){}
	//write an initialization constructor with an int parameter ht
	public Monster2(int ht){
		myHeight = ht;
	}
	//write an initialization constructor with int parameters ht and wt
	public Monster2(int ht, int wt){
		myHeight = ht;
		myWeight = wt;
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster2(int ht, int wt,int age){
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}
	//modifiers - write set methods for height, weight, and age
	void setHeight(int a){myHeight = a;}
	void setWeight(int a){myWeight = a;}
	void setAge(int a){myAge = a;}
	//accessors - write get methods for height, weight, and age
	int getHeight(){return myHeight;}
	int getWeight(){return myWeight;}
	int getAge(){return myAge;}
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster2();
	}

	public boolean equals( Object obj )
	{
		if(obj.toString().equals(this.toString()))
			return true;
		else
			return false;
	}

	public int compareTo( Object obj )
	{
		Monster2 rhs = (Monster2)obj;
		if(rhs.getHeight()<this.getHeight())
			return 1;
		else if(rhs.getHeight()>this.getHeight())
			return -1;
		else{
			if(rhs.getWeight()<this.getWeight())
				return 1;
			else if(rhs.getWeight()>this.getWeight())
				return -1;
			else{
				if(rhs.getAge()<this.getAge())
					return 1;
				else if(rhs.getAge()>this.getAge())
					return -1;
				else
					return 0;
			}
		}
	}

	public String toString(){
		return myHeight + " " + myWeight + " " + myAge;
	}
	
	
}