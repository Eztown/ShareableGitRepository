package interfaces;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class VowelWord implements Comparable<VowelWord>
{
	private String word;

	public VowelWord( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
			for(int a = 0; a<word.length(); a++){
				if(vowels.indexOf(word.charAt(a))>-1)
					vowelCount++;
			}
		return vowelCount;
	}
	
	String getWord(){
		return word;
	}

	public int compareTo(VowelWord other)
	{
		if(this.numVowels()>other.numVowels())
			return 1;
		else if(this.numVowels()<other.numVowels())
			return -1;
		else{
			if(other.getWord().length()<word.length())
				return 1;
			else if(other.getWord().length()>word.length())
				return -1;
			else{
				return -other.getWord().compareTo(word);
			}
		}
	}

	public String toString()
	{
		return word;
	}
}