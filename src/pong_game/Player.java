package pong_game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	
	public boolean right, left;
	public int x, y;
	public int width, height;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 10;
	}
	//logica do jogo
	public void tick() {
		//movendo o player para os lados
		if(right) {
			x++;
		}
		else if(left) {
			x--;
		}
		
		
		//barreira da tela
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}
		else if(x < 0) {
			x = 0;
		}
		
		
	}
	
	//redenrisaçao do jogo
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
}
