package com.hangman.game;

public class GuessLogic {
	
	public HangmanState evaluateGuess(String guess, HangmanState hmState){
		final String[] hmAnswer = hmState.getAnswer();
		boolean goodGuess = false;
		for (int i = 0; i < hmAnswer.length; i++) {
			if (hmAnswer[i].equalsIgnoreCase(guess)) {
				goodGuess = true;
				hmState.getBlanksArray()[i] = guess;
			}
		}
		if (!goodGuess) {
			int deathState = hmState.getCorpse().getCorpseOrdinal(hmState.getCorpse().getCurrentState());
			hmState.getCorpse().dieMore(deathState + 1);
		}

		return hmState;
	}
	
	public void outputHangmanState(HangmanState state) {
		if (state.getCorpse().getCurrentState().equalsIgnoreCase("rightLeg")) {
			System.out.println(state.getCorpse().getCurrentState());//change here
			System.out.println("You're dead.");
			return;
		}
		if (isWinner(state)) {
			System.out.println("You win!!");
			return; //win
		}
		//change here
		System.out.println(state.getCorpse().getCurrentState());
		
		//same
		for (String s : state.getBlanksArray()) {
			System.out.print(s);
		}
		System.out.println("");	
	}
	
	private boolean isWinner(HangmanState state) {
		for (int i = 0; i < state.getAnswer().length; i++){
			if (!state.getAnswer()[i].equalsIgnoreCase(state.getBlanksArray()[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean isGameOver(HangmanState state) {
		if (state.getCorpse().getCurrentState().equalsIgnoreCase("rightLeg")) {
			return true; //lose
		}
		if (isWinner(state)) {
			return true; //win
		}
		return false; //still playing
	}

}
