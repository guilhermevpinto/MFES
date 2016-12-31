package gui;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Quaridor.*;
import Quaridor.quotes.*;

public class QuaridorGui {
	
	public static int WT = 15;
	private static Game game;
	
	private static JFrame frame;
	private static ArrayList<ArrayList<JPanel>> boardGUI = new ArrayList<ArrayList<JPanel>>();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		game = new Game();
				
		// entry menu
		/*
		Menu ex = new Menu("images/quaridor.jpg");
       	ex.setVisible(true);
		*/
		
		frame = new JFrame("Quaridor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		buildBoard();		

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	/**
	 * Constructing the board positions
	 * @param JFrame frame
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void buildBoard() {

		//fetching the VDM Board structure
		ArrayList<ArrayList> board = Board.board;
		
		//creating the main JPanel where the graphics will be drawn
		JPanel main = new JPanel();
		main.setLayout(null);
		main.setPreferredSize(new Dimension(WT*9*4 + WT*8, WT*9*4 + WT*8));
		
		//designing the board according to the VDM board structure
		int rowPixel = 0; //y-axis pixels progression
		for(int row = 0; row < 17; row++) {
			
			int colPixel = 0; //x-axis pixels progression
			ArrayList<JPanel> rowGUI = new ArrayList<JPanel>();			
			
			for(int col = 0; col < 17; col++) {
				
				if((row % 2) == 0) {

					if(board.get(row).get(col) instanceof FREEQuote | board.get(row).get(col) instanceof OCCUPIEDQuote) {
						
						Position p = new Position(col, row, colPixel, rowPixel);
						main.add(p);
						rowGUI.add(p);
						p.draw();
						
						colPixel += QuaridorGui.WT * 4;
					}
					else if(board.get(row).get(col) instanceof NOWALLQuote) {
						
						Wall w = new Wall(col, row, colPixel, rowPixel, Wall.Orientation.VER);
						main.add(w);
						rowGUI.add(w);
						w.draw();

						colPixel += QuaridorGui.WT;
					}
				}
				else if((row % 2) == 1) {
					
					if(board.get(row).get(col) instanceof NOWALLQuote & (col % 2) == 0) {

						Wall w = new Wall(col, row, colPixel, rowPixel, Wall.Orientation.HOR);
						main.add(w);
						rowGUI.add(w);
						w.draw();
						
						colPixel += QuaridorGui.WT * 4;
					}
					else colPixel += QuaridorGui.WT;
				}
			}
			
			boardGUI.add(rowGUI);
			
			if((row % 2) == 0)
				rowPixel += QuaridorGui.WT * 4;
			else
				rowPixel += QuaridorGui.WT;
		}
		
		frame.add(main);
	}
	
	public void setWall(int row, int col) {
		((Wall)boardGUI.get(row).get(col)).setWall();
	}
}
