package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.overture.codegen.runtime.SeqUtil;
import org.overture.codegen.runtime.Utils;
import org.overture.codegen.runtime.VDMMap;
import org.overture.codegen.runtime.VDMSet;

import MFES.Board;
import MFES.Game;
import MFES.Point;

public class QuaridorGui {
	
	public static int WT = 15;
	public static Game game;
	
	private static JFrame frame;
	public static ArrayList<ArrayList<JPanel>> boardGUI = new ArrayList<ArrayList<JPanel>>();
	public static ArrayList<JPanel> playersGUI = new ArrayList<JPanel>();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		if(args.length != 0) {
			if(args[0].equals("2") | args[0].equals("4"))
				game = new Game(Integer.getInteger(args[0]));
			else 
				game = new Game(2);
		}
		else game = new Game(2);
		
		startMenu();
	}
	
	/**
	 * Start the menu
	 */
	private static void startMenu() {
		
		JLayeredPane lpane = new JLayeredPane();
	    JPanel panelQuaridor = new Background("quaridor");
	    HoverPanel panel2Jogadores = new HoverPanel("2jog");
	    HoverPanel panel4Jogadores = new HoverPanel("4jog");
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
        
        panel2Jogadores.setBounds(170, 168, 250, 35);
        panel2Jogadores.setOpaque(false);
        
        panel4Jogadores.setBounds(170, 205, 250, 35);
        panel4Jogadores.setOpaque(false);
        
        panelRegras.setBounds(252, 240, 100, 30);
        panelRegras.setOpaque(false);
        
        lpane.add(panelQuaridor, new Integer(0), 0);
        lpane.add(panel2Jogadores, new Integer(1), 0);
        lpane.add(panel4Jogadores, new Integer(2), 0);
        lpane.add(panelRegras, new Integer(3), 0);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // AVISO código trolha
        while(true){
        	if(panel2Jogadores.getState()){
            	break;
        	}else if(panel4Jogadores.getState()){
        		break;
        	}
            else if(panelRegras.getState()){
            	break;
            }
        }
        // AVISO código trolha
        
        frame.setVisible(false);
        
        if(panel2Jogadores.getState()){
        	game = new Game(2);
        	startGame();
        }
        else if(panel4Jogadores.getState()){
        	game = new Game(4);
        	startGame();
        }
        else if(panelRegras.getState())
        	displayRegras();
        
        frame.addKeyListener(new MyKeyListener(game));
		
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
		
		ArrayList<MFES.Player> players = (ArrayList<MFES.Player>) game.getPlayers();
		
		for(MFES.Player p : players) {

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

					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), MFES.quotes.FREEQuote.getInstance()) | Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), MFES.quotes.OCCUPIEDQuote.getInstance())) {
						
						Position p = new Position(col, row, colPixel, rowPixel);
						main.add(p);
						rowGUI.add(p);
						p.draw();
						
						colPixel += QuaridorGui.WT * 4;
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), MFES.quotes.NOWALLQuote.getInstance())) {
						
						Wall w = new Wall(col, row, colPixel, rowPixel, Wall.Orientation.VER);
						main.add(w);
						rowGUI.add(w);
						w.draw();

						colPixel += QuaridorGui.WT;
					}
				}
				else if((row % 2) == 0) {
					
					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), MFES.quotes.NOWALLQuote.getInstance()) & (col % 2) == 1) {

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
		

		
		VDMSet moves = QuaridorGui.game.getPossibleMoves();
		for(Object o : moves) {
			Point p = (Point)o;
			((Position)QuaridorGui.boardGUI.get(p.getX().intValue()-1).get(p.getY().intValue()-1)).setSelected();
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

					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), MFES.quotes.FREEQuote.getInstance()) | Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), MFES.quotes.OCCUPIEDQuote.getInstance())) {
						if(((Position)boardGUI.get(row-1).get(col-1)).selected)
						((Position)boardGUI.get(row-1).get(col-1)).unsetSelected();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), MFES.quotes.NOWALLQuote.getInstance())) {
						((Wall)boardGUI.get(row-1).get(col-1)).unhoverWall();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row,(long)col)), MFES.quotes.WALLQuote.getInstance())) {
						((Wall)boardGUI.get(row-1).get(col-1)).setWall();
					}
				}
				else if((row % 2) == 0) {
					
					if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), MFES.quotes.NOWALLQuote.getInstance()) & (col % 2) == 1) {
						((Wall)boardGUI.get(row-1).get(col-1)).unhoverWall();
					}
					else if (Utils.equals(Utils.get(board, SeqUtil.seq((long)row, (long)col)), MFES.quotes.WALLQuote.getInstance()) & (col % 2) == 1) {
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
		game.move((long)row, (long)col, game.getPlayer(game.getCurrentPlayer()));
		int playerindex = game.getCurrentPlayer().intValue() - 1;
		gui.Player p = (Player) playersGUI.get(playerindex);
		
		p.move(QuaridorGui.WT*4*((col-1) / 2) + QuaridorGui.WT*((col-1) / 2), QuaridorGui.WT*4*((row-1) / 2) + QuaridorGui.WT*((row-1) / 2));
		
		next();
	}
	
	public static void next() {
		game.updateBoard();

		refresh();
		if(game.currentPlayerWin()) {
			String msg = "Congratulations, the " + getPlayerColor(game.getCurrentPlayer().intValue()) + " player won!!!";
			JOptionPane.showMessageDialog(null, msg);
			frame.dispose();
		}
		
		game.switchPlayer();
		
		VDMSet moves = QuaridorGui.game.getPossibleMoves();
		for(Object o : moves) {
			Point p = (Point)o;
			((Position)QuaridorGui.boardGUI.get(p.getX().intValue()-1).get(p.getY().intValue()-1)).setSelected();
		}
	}
	
	public static String getPlayerColor(int id) {
		switch (id) {
		case 1 : 
			return "RED";
		case 2 : 
			return "GREEN";
		case 3 :
			return "YELLOW";
		case 4 :
			return "PURPLE";
		default : 
			return "RED";
		}
	}
}