package scannerChopper;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
	   LineTotaller Totaller = new LineTotaller("1 2 3 1 2 3 1 2 3 1 2 3");
	   System.out.println(Totaller.getSum());
	   Totaller.setLine("1 1 2 3 4 3 2 4 2 3 4");
	   System.out.println(Totaller.getSum());
	}
}