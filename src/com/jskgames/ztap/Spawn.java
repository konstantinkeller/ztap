package com.jskgames.ztap;

import java.util.Random;

public class Spawn {
	
	static Random rand = new Random();
	
	// Generates an array of integers that represents the sequence of directions
	// for a newly generated enemy.
	public static int[] sequenceGen(int n, int start) {
		int[] seq = new int[n];
		seq[0] = start;
		
		for (int i = 1; i <= n-1; i++) {
			seq[i] = randInt(1,8);
		}
		
		return seq;
	}
	
	// Generates a pseudo-random number between min and max, inclusive.
	public static int randInt(int min, int max) {
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}