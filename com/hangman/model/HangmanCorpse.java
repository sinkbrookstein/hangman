package com.hangman.model;

public enum HangmanCorpse {
	
	HEALTHY,HEAD,BODY,LEFTARM,RIGHTARM,LEFTLEG, RIGHTLEG;

	public static HangmanCorpse dieMore(int i) {
		for (HangmanCorpse corpse : HangmanCorpse.values()) {
			if (corpse.ordinal() == i) {
				return corpse;
			}
		}
		return null;
	}
}
