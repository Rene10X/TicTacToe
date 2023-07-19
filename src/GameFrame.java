import java.awt.Component;

import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel panel;
	GameOverPanel gameOverPanel;
	
	GameFrame(){
		panel = new GamePanel(this);
		
		
		this.setTitle("TicTacToe");
		this.add(panel);
		//this.add(gameOverPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	
	
	
	public void changePanel(char winner) {
		
		System.out.println("changing panels");
		
		gameOverPanel = new GameOverPanel(winner);
		this.remove(panel);
		this.add(gameOverPanel);
		
	}
	
	

} 



