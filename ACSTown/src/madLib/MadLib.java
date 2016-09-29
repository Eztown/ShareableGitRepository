package madLib;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib()
	{
			loadNouns();
			loadVerbs();
			loadAdjectives();
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
			while(file.hasNext()){
				nouns.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Error loadNouns");		
		}	
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Error loadVerbs");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Error loadVerbs");
		}
	}

	public String getRandomVerb()
	{
		return verbs.get((int)Math.random()*verbs.size());
	}
	
	public String getRandomNoun()
	{
		return nouns.get((int)Math.random()*nouns.size());
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get((int)Math.random()*adjectives.size());
	}		

	public String toString(String storyBook)
	{
		String story = "";
		try{
			Scanner file = new Scanner("storyBook");
			story=file.nextLine();
		}
		catch(Exception e){
			out.println("Story Book not found");
		}
		
		for(int a = 0; a<story.length()-1; a++){
			switch (story.charAt(a)){
				case '#':
					//noun
					story = story.substring(0, a) + getRandomNoun() + story.substring(a);
				case '&':
					//adjective
					story = story.substring(0, a) + getRandomAdjective() + story.substring(a);
				case '@':
					//verb
					story = story.substring(0, a) + getRandomVerb() + story.substring(a);
			}
		}
	   return story+"\n\n\n";
	}
}