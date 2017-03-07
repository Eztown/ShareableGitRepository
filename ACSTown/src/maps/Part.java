package maps;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		int a = list.length;
		make = list[a-2]+ " " +list[a-3];
		mode = list[a-4];
		for(int b = 0; b<a-4; b++)
			rest = list[b];
		year = Integer.parseInt(list[a-1]);
	}

	public int compareTo( Part rhs )
	{
		if(this.make.compareTo(rhs.make)!=0)
			return this.make.compareTo(rhs.make);
		else if(this.mode.compareTo(rhs.mode)!=0)
			return this.mode.compareTo(rhs.mode);
		else
			return this.year>rhs.year?1:this.year==rhs.year?0:-1;
	}

	public String toString()
	{
		return make + " " + year + " " + rest + " " + mode;
	}
}