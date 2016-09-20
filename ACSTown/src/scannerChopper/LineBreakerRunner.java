package scannerChopper;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
	   LineBreaker LineBreaker = new LineBreaker(spacer("Advanced Computer Science"),3);
	   System.out.println(LineBreaker.toString());
	   LineBreaker.setLineBreaker(spacer("Computer Science is Awesome!"), 5);
	   System.out.println(LineBreaker.toString());
	}
   
   public static String spacer(String in){
	   String spacer = "";
	   for(int a = 0; a<in.length(); a++)
		   if(in.charAt(a)!=' '){
			   spacer+=in.charAt(a)+" ";
		   }
		   else
			   spacer+=" ";
	   return spacer;
   }
}