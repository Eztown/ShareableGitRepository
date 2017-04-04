package queue;

public class Monster implements Comparable<Monster>{
	
	public int height, weight, age;

	public Monster(){
		
	}
	
	public Monster(int ht){
		height = ht;
	}
	
	public Monster(int ht, int et){
		height = ht;
		weight = et;
	}
	
	public Monster(int ht, int wt, int ag){
		height = ht;
		weight = wt;
		age = ag;
	}
	
	public void setWeight(int wt){
		weight = wt;
	}
	
	public void setHeight( int ht){
		height = ht;
	}
	
	public void setAge( int ag){
		age = ag;
	}
	
	public Object clone(){
		return new Monster(height, weight, age);
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean equals( Monster o ){
		if(o.height==this.height)
			if(o.weight == this.weight){
				if(o.age==this.age)
					return true;
				else
					return false;
			}
			else
				return false;
		else
			return false;
	}
	
	public int compareTo(Monster r){
		if(r.height==this.height){
			if(r.weight == this.weight){
				if(r.age==this.age)
					return 0;
				else
					return r.age>this.age?-1:1;	
			}
			else
				return r.age>this.age?-1:1;
		}
		else
		return r.height>this.height?-1:1;
	}
	
	public String toString(){
		return "|"+weight+", "+height+", "+age+"|";
	}
	
}
