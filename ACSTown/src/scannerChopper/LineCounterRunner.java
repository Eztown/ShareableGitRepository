package scannerChopper;

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   LineCounter Counter = new LineCounter("123 123 123 123");
	   System.out.println(Counter.getCount());
	   Counter.setLine("1 123 234 3 2 4 2 3 4");
	   System.out.println(Counter.getCount());
	}
}