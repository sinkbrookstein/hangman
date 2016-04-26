package com.hangman.game;

public class HangmanState {
		
    private String[] blanksArray; 
    private String[] answer;
    private HangmanCorpse corpse;
    
	public HangmanState(String[] answer, HangmanCorpse corpse) {
		super();
		this.blanksArray = initializeBlanks(answer.length);
		this.answer = answer;
		this.corpse = corpse;
	}
	public String[] getBlanksArray() {
		return blanksArray;
	}
	public void setBlanksArray(String[] blanksArray) {
		this.blanksArray = blanksArray;
	}
	public String[] getAnswer() {
		return answer;
	}
	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	public HangmanCorpse getCorpse() {
		return corpse;
	}
	public void setCorpse(HangmanCorpse corpse) {
		this.corpse = corpse;
	}
    
	private String[] initializeBlanks(int length) {
		String[] blanks = new String[length];
		for (int i = 0; i < length; i++) {
			blanks[i] = "_";
		}
		return blanks;
	}

}
