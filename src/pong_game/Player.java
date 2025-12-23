package pong_game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	//logica do jogo
	public void tick() {
		
	}
	
	//redenrisaçao do jogo
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(100, 120-10, 40, 10);
	}
}
