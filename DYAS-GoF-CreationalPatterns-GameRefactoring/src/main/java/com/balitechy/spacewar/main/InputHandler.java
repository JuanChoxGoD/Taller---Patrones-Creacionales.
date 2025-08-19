package com.balitechy.spacewar.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter{
	
	private Player Player;
	
	public InputHandler(Player Player){
		this.Player = Player;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Player.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Player.keyReleased(e);
	}

}
