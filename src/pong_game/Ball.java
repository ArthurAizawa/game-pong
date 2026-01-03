package pong_game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball {
	
	public int x, y;
	public int width, height;
	public double dx, dy;
	public double speed = 1.2;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 3; // com o scale 3 = 9
		this.height = 3;
		
		dx = new Random().nextGaussian();
		dy = new Random().nextGaussian();
		}
	
	public void tick() {
		x+=dx*speed;
		y+=dy*speed;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
}
