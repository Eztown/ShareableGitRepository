package hashTable;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

public class Word
{
	private String theValue, vowels;
	
	public Word(String value)
	{
		theValue = value;
		vowels = "aeiou";
	}	
	
	public String getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		return obj.toString() == this.theValue;
	} 
	
	public int hashCode()
	{
		int vCount = 0;
		for(int a = 0; a<theValue.length(); a++)
			if(vowels.indexOf(theValue.charAt(a))>-1)
				vCount++;
		return (vCount*theValue.length())%10;
	}

	public String toString()
	{
		return theValue+" ";
	}	
}