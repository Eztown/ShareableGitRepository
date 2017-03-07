import java.util.Map;
import java.util.TreeMap;

public class Student {
	
	private String line;
	private String abs;
	private Map<String,String> maps;
	
	public Student(){
		maps =new TreeMap<String,String >();
	}
	
	public Student(String line){
		String[] nah = line.split(" ");
		maps.put(nah[0], nah[1]);
		
	}
	
	public String getNumAbsences(String abs){
		String count = " ";
		for(String s: maps.keySet()){
			count += maps.get(s);
		}
		return count;
	}
	
	public String toString(){
		return maps.toString();
	}
}