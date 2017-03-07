package t2FRQ;

import java.util.*;

public class Thesaurus {

	private Map<String, Set<String>> wordMap;
	
	public Thesaurus(){
		wordMap = new TreeMap<String, Set<String>>();
	}
	
	public void addSynonym(String word, String sym){
		if(wordMap.containsKey(word)){
			Set<String> temp = wordMap.get(word);
			temp.add(sym);
			wordMap.put(word, temp);
		}
		else{
			Set<String> temp = new TreeSet<String>();
			temp.add(sym);
			wordMap.put(word, temp);
		}
	}
	
	public Set removeSynonym(String syn){
		Set<String> returner = new TreeSet<String>();
			for(String s : wordMap.keySet()){
				if(wordMap.get(s).contains(syn)){
					returner.add(s);
					wordMap.get(s).remove(syn);
				}
			}
		return returner;
	}
	
	public String toString(){
		return wordMap.toString();
	}
}
