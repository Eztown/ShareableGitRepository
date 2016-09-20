package scannerFiles;

public class Box
{
   private String let;
   private int size;

	public Box(){
		
	}
	
	public Box(String s){
		let = s.substring(0,1);
		size = Integer.parseInt(s.substring(2));
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a<size; a++){
			for(int b = 0; b<size; b++){
				output+=let;
			}
			output+="\n";
		}
		return output+"\n";
	}
}