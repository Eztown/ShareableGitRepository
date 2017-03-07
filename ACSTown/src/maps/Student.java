package maps;

public class Student {
	
	private String name;
	private int numAbsences;
	
	public Student(){
		
	}
	
	public Student(String theName, int absc){
		name = theName;
		numAbsences = absc;
	}
	
	public int getNumAbseneces(){
		return numAbsences;
	}
	
	public String toString(){
		return name+" "+numAbsences;
	}
}