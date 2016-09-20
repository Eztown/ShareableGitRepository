package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

class BoxWord
{
   private String word;

	public BoxWord()
	{
		
	}

	public BoxWord(String s)
	{
		setWord(s);
		toString();
	}

	public void setWord(String w)
	{
		word=w;
	}

	public String toString()
	{
		String output="";
		output+=word+"\n";
		for(int a = 1;a<word.length()-1;a++){
			for(int b = 0;b<=word.length(); b++){
				if(b==0)
					output+=word.substring(a, a+1);
				if(b<word.length()-2)
					output+=" ";
				if(b==word.length())
					output+=word.substring(word.length()-a-1,(word.length()-a));
			}
			output+="\n";
			}
		for(int c=word.length()-1; c>-1; c--){
			if(c==word.length()-1)
				output+=word.substring(c);
			else
				output+=word.substring(c, c+1);
}
		return output+"\n";
	}
}