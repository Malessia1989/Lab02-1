package it.polito.tdp.alien.model;

import java.util.*;

public class AlienDictionary {
	//lista di oggetti word
	List<Word> dizionario ;

	public AlienDictionary() {
		dizionario= new LinkedList<Word>();
	}
	
	public void resetDizionario() {
		dizionario.clear();
	}

	public void addParola(String alienWord, String traslation) {
		Word w= new Word( alienWord,  traslation);
	
		for( Word p: dizionario) {
			if(p.getAlienWord().equals(alienWord)) {
				dizionario.remove(p);
				dizionario.add(w);
			}
		}
		dizionario.add(w);
	}
	public String traslationWord(String alienWord) {
		String ris=null;
		for (Word w :dizionario) {
			if(w.getAlienWord().equals(alienWord)) {
				ris= w.getTraslation();
				break;
			}
		}
		return ris;
	} 
	
	
}
