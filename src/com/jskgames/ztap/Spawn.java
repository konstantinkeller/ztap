package com.jskgames.ztap;

import java.util.Random;

public class Spawn {
	
	static Random rand = new Random();
	
	// Generates an array of integers that represents the sequence of directions
	// for a newly generated enemy.
	public static int[] sequenceGen(int length, int start) {
		int[] seq = new int[length];
		seq[0] = start;
		
		for (int i = 1; i <= length-1; i++) {
			seq[i] = randInt(1,8);
		}
		
		return seq;
	}
	
	// Generates a pseudo-random number between min and max, inclusive.
	public static int randInt(int min, int max) {
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	// Generates length of sequence based on the level
	// Resets length per 10 levels
	public static int lengthGen (int level)
	{
		if (level % 10 == 0)
			return 10;
		else
			return (level + 4);
	}
	
	// Movespeed of individual enemy. Will be tested further
	// Placeholder for now.
	public static int moveSpeed (int level)
	{
		int moveSpeedX = 5 * level;
		int moveSpeedY = 5 * level;
		return 1;
	}

}