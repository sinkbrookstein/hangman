package com.hangman.game;

public class HangmanCorpse {
	
	private String currentState = "healthy";
		
	private static String[] corpseStates = {"healthy", "head", "body", "leftArm", "rightArm", "leftLeg", "rightLeg"};

	public String dieMore(int i) {
		setCurrentState(corpseStates[i]);
		return corpseStates[i];
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	
	public int getCorpseOrdinal(String state) {
		for (int i = 0; i < corpseStates.length ; i++) {
			if (corpseStates[i].equalsIgnoreCase(state)) {
				return i;
			}
		}
		return 0;//this would be a bug
	}
	
}
