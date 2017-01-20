package interfaces;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public String getWord(){
		return word;
	}

	public int compareTo( Word w )
	{	
		if(w.getWord().length()<word.length())
			return 1;
		else if(w.getWord().length()>word.length())
			return -1;
		else
			return 0;
	}

	public String toString()
	{
		return word;
	}
}