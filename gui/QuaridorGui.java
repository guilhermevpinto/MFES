package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import org.overture.codegen.runtime.SeqUtil;
import org.overture.codegen.runtime.Utils;
import org.overture.codegen.runtime.VDMMap;

import Quaridor.Board;
import Quaridor.Game;

public class QuaridorGui {
	
	public static int WT = 15;
	public static Game game;
	
	private static JFrame frame;
	public static ArrayList<ArrayList<JPanel>> boardGUI = new ArrayList<ArrayList<JPanel>>();
	public static ArrayList<JPanel> playersGUI = new ArrayList<JPanel>();
	
	public static boolean currentPlayerSelected = false;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		game = new Game(2);
		
		startMenu();
	}
	
	/**
	 * Start the menu
	 */
	private static void startMenu() {
		
		JLayeredPane lpane = new JLayeredPane();
	    JPanel panelQuaridor = new Background("quaridor");
	    HoverPanel panelJogar = new HoverPanel("jogar");
	    HoverPanel panelRegras = new HoverPanel("regras");
		
	    frame = new JFrame("Quaridor Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(605, 356));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        
        lpane.setBounds(0, 0, 615, 365);
        panelQuaridor.setBounds(0, 0, 615, 365);
        panelQuaridor.setOpaque(true);
        
        panelJogar.setBounds(210, 180, 180, 60);
        panelJogar.setOpaque(false);
        
        panelRegras.setBounds(252, 240, 100, 30);
        panelRegras.setOpaque(false);
        
        lpane.add(panelQuaridor, new Integer(0), 0);
        lpane.add(panelJogar, new Integer(1), 0);
        lpane.add(panelRegras, new Integer(2), 0);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // AVISO código trolha
        while(true){
        	if(panelJogar.getState()){
            	break;
        	}
            else if(panelRegras.getState()){
            	break;
            }
        }
        // AVISO código trolha
        
        frame.setVisible(false);
        
        if(panelJogar.getState())
        	startGame();
        else if(panelRegras.getState())
        	displayRegras();
		
	}
	
	public static void displayRegras(){
		
		JLayeredPane layerPane = new JLayeredPane();
	    JPanel panelRegrasBackground = new Background("back");
	    HoverPanel back = new HoverPanel("back");
		
	    frame = new JFrame("Quaridor Regras");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(605, 356));
        frame.setLayout(new BorderLayout());
        frame.add(layerPane, BorderLayout.CENTER);
        
        layerPane.setBounds(0, 0, 615, 365);
        panelRegrasBackground.setBounds(0, 0, 615, 365);
        panelRegrasBackground.setOpaque(true);
        
        back.setBounds(-1, -1, 50, 50);
        back.setOpaque(false);
        
        layerPane.add(panelRegrasBackground, new Integer(0), 0);
        layerPane.add(back, new Integer(1), 0);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // AVISO código trolha
        while(true){
        	if(back.getState()){
            	break;
        	}
        }
        // AVISO código trolha
        
        frame.setVisible(false);
        
        startMenu();
		
	}
	
	/**
	 * Start the game
	 */
	private static void startGame() {
		
		frame = new JFrame("Quaridor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		setup();		

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void setup() {
		JPanel main = new JPanel();
		main.setLayout(null);
		main.setPreferredSize(new Dimension(WT*9*4 + WT*8, WT*9*4 + WT*8));
		loadPlayers(main);
		loadBoard(main);
		frame.add(main);
	}
	
	
	@SuppressWarnings("unchecked")
	public static void loadPlayers(JPanel main) {
		
		ArrayList<Quaridor.Player> players = (ArrayList<Quaridor.Player>) game.getPlayers();
		
		for(Quaridor.Player p : players) {

			int col = p.getPosition().getY().intValue();
			int row = (int)p.getPosition().getX().intValue();

			gui.Player playerGUI = new gui.Player((int)p.getPlayerID().intValue(), col, row, QuaridorGui.WT*4*((col-1) / 2) + QuaridorGui.WT*((col-1) / 2), QuaridorGui.WT*4*((row-1) / 2) + QuaridorGui.WT*((row-1) / 2));
			
			playersGUI.add(playerGUI);
			main.add(playerGUI);
			playerGUI.draw();
			
		}
	}
	
	
	/**
	 * Constructing the board positions
	 * @param JFrame frame
	 */
	public static void loadBoard(JPanel main) {		

		//fetching the VDM Board structure
		VDMMap board = Board.board;
		
		//creating the main JPanel where the graphics will be drawn
		
		//designing the board according to the VDM board structure
		int rowPixel = 0; //y-axis pixels progression
		for(int row = 1; row < 18; row++) {
			
			int colPixel = 0; //x-axis pixels progression
			ArrayList<JPanel> rowGUI = new ArrayList<JPanel>();			
			
			for(int col = 1; col < 18; col++) {
				
				if((row % 2) == 1) {

					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), Quaridor.quotes.FREEQuote.getInstance()) | Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), Quaridor.quotes.OCCUPIEDQuote.getInstance())) {
						
						Position p = new Position(col, row, colPixel, rowPixel);
						main.add(p);
						rowGUI.add(p);
						p.draw();
						
						colPixel += QuaridorGui.WT * 4;
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), Quaridor.quotes.NOWALLQuote.getInstance())) {
						
						Wall w = new Wall(col, row, colPixel, rowPixel, Wall.Orientation.VER);
						main.add(w);
						rowGUI.add(w);
						w.draw();

						colPixel += QuaridorGui.WT;
					}
				}
				else if((row % 2) == 0) {
					
					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), Quaridor.quotes.NOWALLQuote.getInstance()) & (col % 2) == 1) {

						Wall w = new Wall(col, row, colPixel, rowPixel, Wall.Orientation.HOR);
						main.add(w);
						rowGUI.add(w);
						w.draw();
						
						colPixel += QuaridorGui.WT * 4;
					}
					else 
					{
						Joint j = new Joint(colPixel, rowPixel);
						main.add(j);
						rowGUI.add(j);
						j.draw();
						
						colPixel += QuaridorGui.WT;
					}
				}
			}
			
			boardGUI.add(rowGUI);
			
			if((row % 2) == 1)
				rowPixel += QuaridorGui.WT * 4;
			else
				rowPixel += QuaridorGui.WT;
		}
		
	}
	
	public static void refresh() {		

		//fetching the VDM Board structure
		VDMMap board = Board.board;
		
		//creating the main JPanel where the graphics will be drawn
		
		//designing the board according to the VDM board structure
		for(int row = 1; row < 18; row++) {		
			
			for(int col = 1; col < 18; col++) {
				
				if((row % 2) == 1) {

					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), Quaridor.quotes.FREEQuote.getInstance()) | Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), Quaridor.quotes.OCCUPIEDQuote.getInstance())) {
						if(((Position)boardGUI.get(row-1).get(col-1)).selected)
						((Position)boardGUI.get(row-1).get(col-1)).unsetSelected();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), Quaridor.quotes.NOWALLQuote.getInstance())) {
						((Wall)boardGUI.get(row-1).get(col-1)).unhoverWall();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), Quaridor.quotes.WALLQuote.getInstance())) {
						((Wall)boardGUI.get(row-1).get(col-1)).setWall();
					}
				}
				else if((row % 2) == 0) {
					
					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), Quaridor.quotes.NOWALLQuote.getInstance()) & (col % 2) == 1) {
						((Wall)boardGUI.get(row-1).get(col-1)).unhoverWall();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), Quaridor.quotes.WALLQuote.getInstance()) & (col % 2) == 1) {
						((Wall)boardGUI.get(row-1).get(col-1)).setWall();
					}
				}
			}
		}
		
	}
	
	public static void setWall(int row, int col) {
		((Wall)boardGUI.get(row-1).get(col-1)).setWall();
	}
	
	public static void movePlayer(int row, int col) {
		if(currentPlayerSelected) {
			game.move((long)row, (long)col, game.getPlayer(game.getCurrentPlayer()));
			int playerindex = game.getCurrentPlayer().intValue() - 1;
			gui.Player p = (Player) playersGUI.get(playerindex);
			
			p.move(QuaridorGui.WT*4*((col-1) / 2) + QuaridorGui.WT*((col-1) / 2), QuaridorGui.WT*4*((row-1) / 2) + QuaridorGui.WT*((row-1) / 2));
			
			next();

		}
	}
	
	public static void next() {
		game.updateBoard();
		game.switchPlayer();
		refresh();
	}
}