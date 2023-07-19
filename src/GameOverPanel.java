import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameOverPanel extends JPanel{
	
	char winner;

	GameOverPanel(char winner){
		this.setPreferredSize(new Dimension(600, 600));
		this.winner = winner;
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		
		if(winner == 'N') {
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			g.drawString("mitte keegi ei võitnud", 100, 300);
		} else {
			g.setFont(new Font("Ink Free", Font.BOLD, 75));
			g.drawString(winner + " Võitis", 160, 300);
		}
		
	}
}
