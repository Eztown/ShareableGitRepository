package t2FRQ;

public class Runner {
	
	public static void main(String[] args){	
		Thesaurus t = new Thesaurus();
		t.addSynonym("Happy", "Joyful");
		t.addSynonym("Happy", "Cheerful");
		t.addSynonym("Happy", "Elated");
		t.addSynonym("Sad", "Depressed");
		t.addSynonym("Happy", "Emotional");
		t.addSynonym("Sad", "Emotional");
		System.out.println(t.toString());
		System.out.println(t.removeSynonym("Emotional"));
		System.out.println(t.toString());
	}
	
}
