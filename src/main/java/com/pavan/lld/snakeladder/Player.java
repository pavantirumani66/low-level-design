package com.pavan.lld.snakeladder;

import lombok.Getter;
import lombok.Setter;

public class Player {

	private int playerId;
	@Getter
	private String playerName;
	@Getter
	@Setter
	private int currentPosition;
	@Getter
	@Setter
	private boolean winStatus;
	public Player(int playerId, String playerName) {
		this.playerId = playerId;
		this.playerName = playerName;
	}
}
