package com.hangman.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hangman.model.HangmanCorpse;
import com.hangman.model.HangmanState;

public class TestHangman {
	
	
	public static void main(String[] args){
		List<String> potentialAnswers = new ArrayList<String>();
		potentialAnswers.add("funny");
		potentialAnswers.add("bubble");
		potentialAnswers.add("marshmallow");
		GuessLogic gl = new GuessLogic();
		System.out.println("We are playing hangman");
		System.out.println("But first pick a number between 0 and " 
				+ (potentialAnswers.size() - 1));
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		HangmanState hmState = new HangmanState(potentialAnswers.get(k).split(""), HangmanCorpse.HEALTHY);
		gl.outputHangmanState(hmState);

		do {
			System.out.println("Take a guess: ");
			String guess = scanner.next();
			hmState = gl.evaluateGuess(guess, hmState);
			gl.outputHangmanState(hmState);

		} while (!gl.isGameOver(hmState));

		
		scanner.close();
		System.exit(0);
	}

}
