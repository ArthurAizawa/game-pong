package pong_game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 240;
	public static int HEIGHT = 120;
	public static int SCALE = 3; 
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		
		JFrame frame = new JFrame();
		frame.setResizable(false); //nao permite o redimensionamento do usuario
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
