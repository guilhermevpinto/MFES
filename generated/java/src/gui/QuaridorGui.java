package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuaridorGui {
	public static int WT = 15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Quaridor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		buildBoard(frame);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * Constructing the board positions
	 * @param JFrame frame
	 */
	public static void buildBoard(JFrame frame) {
		JPanel main = new JPanel();
		main.setLayout(null);
		main.setPreferredSize(new Dimension(WT*9*4 + WT*8, WT*9*4 + WT*8));

		//placing the possible Positions for the players
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				Position p = new Position(j, i);
				main.add(p);
				p.draw();
				
				if(i < 8) {
					Wall w = new Wall(j*WT*4 + j*WT, (i+1)*WT*4 + i*WT, Wall.Orientation.HOR);
					main.add(w);
					w.draw();
				}
				
				if(j < 8) {
					Wall w = new Wall((j+1)*WT*4 + j*WT, i*WT*4 + i*WT, Wall.Orientation.VER);
					main.add(w);
					w.draw();
				}
			}			
		}
		
			
		frame.add(main);
	}
}
