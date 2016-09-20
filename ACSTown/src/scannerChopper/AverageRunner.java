package scannerChopper;

public class AverageRunner
{
   public static void main( String args[] )
   {
	   Average Averager = new Average("2 3 4 5 6");
	   System.out.println(Averager.toString());
	   Averager.setLine("2 4 7 5 3 4 6 7 5 3 2 1 7 7 7");
	   System.out.println(Averager.toString());
	}
}