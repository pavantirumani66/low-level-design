package com.pavan.lld.snakeladder;

import java.util.Random;

public class Dice {
	
		private int numberOfDice;

		public Dice(int numberOfDice) {
			this.numberOfDice = numberOfDice;
		}
		
		public int rollDice() {
			 Random random = new Random();
			 return random.nextInt(6*numberOfDice-1*numberOfDice)+1*numberOfDice;
//			return Random.nextInt(numberOfDice*6 - numberOfDice*2 + 1) + numberOfDice*2;
		}
		
}
