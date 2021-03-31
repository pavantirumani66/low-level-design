package com.pavan.lld.snakeladder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
	
public class SnakeLadderMain {

	public static void main(String[] args) {
		Dice dice = new Dice(1);
		Player p1 = new Player(1,"pavan");
		Player p2 = new Player(2,"vamsi");
		Queue<Player> players = new LinkedList<Player>();
		players.offer(p1);
		players.offer(p2);
		
		Jumper s1 = new Jumper(20, 10);
		Jumper s2 = new Jumper(30, 11);
		Jumper s3 = new Jumper(70, 22);
		List<Jumper> snakes = new ArrayList<Jumper>();
		snakes.add(s1);
		snakes.add(s2);
		snakes.add(s3);
		
		Jumper l1 = new Jumper(21, 32);
		Jumper l2 = new Jumper(31, 50);
		Jumper l3 = new Jumper(71, 80);
		List<Jumper> ladders = new ArrayList<Jumper>();
		ladders.add(l1);
		ladders.add(l2);
		ladders.add(l3);
		
		GameBoard gameBoard = new GameBoard( 100,  players,snakes, ladders, dice);
		gameBoard.startGame();
	}

}
