package com.pavan.lld.snakeladder;

import java.util.List;
import java.util.Queue;

public class GameBoard {

	private int boardSize;
	private Queue<Player> players;
	private List<Jumper> snakes;
	private List<Jumper> ladders;
	private Dice dice;

	public GameBoard(int boardSize, Queue<Player> player, List<Jumper> snakes, List<Jumper> ladders, Dice dice) {
		this.boardSize = boardSize;
		this.players = player;
		this.snakes = snakes;
		this.ladders = ladders;
		this.dice = dice;
	}

	public void startGame() {
		while (true) {
			Player player = players.poll();
			int nextRoll = dice.rollDice();
			int currentPosition = player.getCurrentPosition() + nextRoll;
			if (currentPosition > boardSize) {
				players.offer(player);
			} else if (currentPosition == boardSize) {
				System.out.println(player.getPlayerName() + " Won The Game");
				player.setWinStatus(true);
			} else {
				player.setCurrentPosition(validateNextPosition(currentPosition));
				if(player.getCurrentPosition()==boardSize) {
					player.setWinStatus(true);
					System.out.println(player.getPlayerName() + " Won The Game");
				}else {
					System.out.println(player.getPlayerName() + "  : new Position   :" +player.getCurrentPosition());
					players.offer(player);
				}
			}
			if(players.size()<2) break ;
		}
	}

	private int validateNextPosition(int currentPosition) {
		int newCurrent = currentPosition;
		for (Jumper jumper : snakes) {
			if (jumper.getStartPosition() == currentPosition) {
				System.out.println("Got Snake current Position " + jumper.getStartPosition());
				newCurrent = jumper.getEndPosition();
			}
		}
		for (Jumper jumper : ladders) {
			if (jumper.getStartPosition() == currentPosition) {
				System.out.println("Got Snake current Position " + jumper.getStartPosition());
				newCurrent = jumper.getEndPosition();
			}
		}
		return newCurrent;
	}

}
