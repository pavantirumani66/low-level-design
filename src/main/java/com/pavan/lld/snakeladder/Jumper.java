package com.pavan.lld.snakeladder;

import lombok.Getter;

@Getter
public class Jumper {
	
	private int startPosition;
	private int endPosition;

	public Jumper(int startPosition, int endPosition) {
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}

}
