import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class GamePanel extends JPanel implements ActionListener{
	
	
	int screenWidth = 600;
	int screenHeight = 600;
	int buttonWidth = screenWidth / 3;
	int buttonHeight = screenHeight / 3;
	char turn = 'X';
	int numOfTurns = 0;
	int[][] boardX = new int[3][3];
	int[][] boardO = new int[3][3];	
	
	GameFrame frame;
		
	JButton TL;
	JButton TC;
	JButton TR;
	JButton ML;
	JButton MC;
	JButton MR;
	JButton BL;
	JButton BC;
	JButton BR;
	

	GamePanel(GameFrame frame){ 	
		
		this.frame = frame;
	
		initalizeButtons();
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setLayout(null);
		this.add(TL);
		this.add(TC);
		this.add(TR);
		this.add(ML);
		this.add(MC);
		this.add(MR);
		this.add(BL);
		this.add(BC);
		this.add(BR);
		
		
	}

	private void initalizeButtons() {
		
		TL = new JButton();
		TC = new JButton();
		TR = new JButton();
		ML = new JButton();
		MC = new JButton();
		MR = new JButton();
		BL = new JButton();
		BC = new JButton();
		BR = new JButton();
		
		TL.setBounds(0, 0, buttonWidth, buttonHeight);
		TC.setBounds(200, 0, buttonWidth, buttonHeight);
		TR.setBounds(400, 0, buttonWidth, buttonHeight);
		ML.setBounds(0, 200, buttonWidth, buttonHeight);
		MC.setBounds(200, 200, buttonWidth, buttonHeight);
		MR.setBounds(400, 200, buttonWidth, buttonHeight);
		BL.setBounds(0, 400, buttonWidth, buttonHeight);
		BC.setBounds(200, 400, buttonWidth, buttonHeight);
		BR.setBounds(400, 400, buttonWidth, buttonHeight);
		
		TL.setFocusable(false);
		TC.setFocusable(false);
		TR.setFocusable(false);
		BL.setFocusable(false);
		BC.setFocusable(false);
		BR.setFocusable(false);
		ML.setFocusable(false);
		MC.setFocusable(false);
		MR.setFocusable(false);
		
		TL.addActionListener(this);
		TC.addActionListener(this);
		TR.addActionListener(this);
		BL.addActionListener(this);
		BC.addActionListener(this);
		BR.addActionListener(this);
		ML.addActionListener(this);
		MC.addActionListener(this);
		MR.addActionListener(this);
	}
	
	private void checkGame() {
		System.out.println(numOfTurns);
		if(numOfTurns >= 9) {
			//game over
			System.out.println("game over");
			frame.changePanel('N');
		}
		
		// X winning three in a row across the top row.
		if(boardX[0][0] == 1 && boardX[1][0] == 1 && boardX[2][0] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a row across the middle row.
		if(boardX[0][1] == 1 && boardX[1][1] == 1 && boardX[2][1] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a row across the bottom row.
		if(boardX[0][2] == 1 && boardX[1][2] == 1 && boardX[2][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a column down the left column.
		if(boardX[0][0] == 1 && boardX[0][1] == 1 && boardX[0][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a column down the middle column.
		if(boardX[1][0] == 1 && boardX[1][1] == 1 && boardX[1][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a column down the right column.
		if(boardX[2][0] == 1 && boardX[2][1] == 1 && boardX[2][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a diagonal from the top-left to the bottom-right.
		if(boardX[0][0] == 1 && boardX[1][1] == 1 && boardX[2][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		// X winning three in a diagonal from the top-right to the bottom-left.
		if(boardX[2][0] == 1 && boardX[1][1] == 1 && boardX[0][2] == 1) {
			System.out.println("X wins");
			frame.changePanel('X');
		}
		
		
		// O winning three in a row across the top row.
		if(boardO[0][0] == 1 && boardO[1][0] == 1 && boardO[2][0] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a row across the middle row.
		if(boardO[0][1] == 1 && boardO[1][1] == 1 && boardO[2][1] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a row across the bottom row.
		if(boardO[0][2] == 1 && boardO[1][2] == 1 && boardO[2][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a column down the left column.
		if(boardO[0][0] == 1 && boardO[0][1] == 1 && boardO[0][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a column down the middle column.
		if(boardO[1][0] == 1 && boardO[1][1] == 1 && boardO[1][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a column down the right column.
		if(boardO[2][0] == 1 && boardO[2][1] == 1 && boardO[2][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a diagonal from the top-left to the bottom-right.
		if(boardO[0][0] == 1 && boardO[1][1] == 1 && boardO[2][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}
		// O winning three in a diagonal from the top-right to the bottom-left.
		if(boardO[2][0] == 1 && boardO[1][1] == 1 && boardO[0][2] == 1) {
			System.out.println("O wins");
			frame.changePanel('O');
		}		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == TL) {
			System.out.println("TL");
			if(turn == 'X') {
				TL.setText("X");
				turn = 'O';
				TL.setEnabled(false);
				numOfTurns++;
				boardX[0][0] = 1;
				checkGame();
			} else if(turn == 'O') {
				TL.setText("O");
				turn = 'X';
				TL.setEnabled(false);
				numOfTurns++;
				boardO[0][0] = 1;
				checkGame();
			}
			
		}
		if(e.getSource() == TC) {
			System.out.println("TC");
			if(turn == 'X') {
				TC.setText("X");
				turn = 'O';
				TC.setEnabled(false);
				numOfTurns++;
				boardX[1][0] = 1;
				checkGame();
			} else if(turn == 'O') {
				TC.setText("O");
				turn = 'X';
				TC.setEnabled(false);
				numOfTurns++;
				boardO[1][0] = 1;
				checkGame();
			}
		}
		if(e.getSource() == TR) {
			System.out.println("TR");
			if(turn == 'X') {
				TR.setText("X");
				turn = 'O';
				TR.setEnabled(false);
				numOfTurns++;
				boardX[2][0] = 1;
				checkGame();
			} else if(turn == 'O') {
				TR.setText("O");
				turn = 'X';
				TR.setEnabled(false);
				numOfTurns++;
				boardO[2][0] = 1;
				checkGame();
			}
		}
		if(e.getSource() == ML) {
			System.out.println("ML");
			if(turn == 'X') {
				ML.setText("X");
				turn = 'O';
				ML.setEnabled(false);
				numOfTurns++;
				boardX[0][1] = 1;
				checkGame();
			} else if(turn == 'O') {
				ML.setText("O");
				turn = 'X';
				ML.setEnabled(false);
				numOfTurns++;
				boardO[0][1] = 1;
				checkGame();
			}
		}
		if(e.getSource() == MC) {
			System.out.println("MC");
			if(turn == 'X') {
				MC.setText("X");
				turn = 'O';
				MC.setEnabled(false);
				numOfTurns++;
				boardX[1][1] = 1;
				checkGame();
			} else if(turn == 'O') {
				MC.setText("O");
				turn = 'X';
				MC.setEnabled(false);
				numOfTurns++;
				boardO[1][1] = 1;
				checkGame();
			}
		}
		if(e.getSource() == MR) {
			System.out.println("MR");
			if(turn == 'X') {
				MR.setText("X");
				turn = 'O';
				MR.setEnabled(false);
				numOfTurns++;
				boardX[2][1] = 1;
				checkGame();
			} else if(turn == 'O') {
				MR.setText("O");
				turn = 'X';
				MR.setEnabled(false);
				numOfTurns++;
				boardO[2][1] = 1;
				checkGame();
			}
		}
		if(e.getSource() == BL) {
			System.out.println("BL");
			if(turn == 'X') {
				BL.setText("X");
				turn = 'O';
				BL.setEnabled(false);
				numOfTurns++;
				boardX[0][2] = 1;
				checkGame();
			} else if(turn == 'O') {
				BL.setText("O");
				turn = 'X';
				BL.setEnabled(false);
				numOfTurns++;
				boardO[0][2] = 1;
				checkGame();
			}
		}
		if(e.getSource() == BC) {
			System.out.println("BC");
			if(turn == 'X') {
				BC.setText("X");
				turn = 'O';
				BC.setEnabled(false);
				numOfTurns++;
				boardX[1][2] = 1;
				checkGame();
			} else if(turn == 'O') {
				BC.setText("O");
				turn = 'X';
				BC.setEnabled(false);
				numOfTurns++;
				boardO[1][2] = 1;
				checkGame();
			}
		}
		if(e.getSource() == BR) {
			System.out.println("BR");
			if(turn == 'X') {
				BR.setText("X");
				turn = 'O';
				BR.setEnabled(false);
				numOfTurns++;
				boardX[2][2] = 1;
				checkGame();
			} else if(turn == 'O') {
				BR.setText("O");
				turn = 'X';
				BR.setEnabled(false);
				numOfTurns++;
				boardO[2][2] = 1;
				checkGame();
			}
		}
		
	}
	
	
}
