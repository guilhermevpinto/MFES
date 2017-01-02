package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import Quaridor.Game;

public class MyKeyListener implements KeyListener {

	private Game game;
	
	public MyKeyListener(Game game) {
		this.game = game;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode()== KeyEvent.VK_H) {
			 String msg = getHelpMessage();
			 JOptionPane.showMessageDialog(null, msg);
		 }

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	private String getHelpMessage() {
		String first = "Current Player : " + QuaridorGui.getPlayerColor(game.getCurrentPlayer().intValue());
		String second = "";
		for(Object o : game.getPlayers()){
			Quaridor.Player p = (Quaridor.Player)o;
			second += QuaridorGui.getPlayerColor(p.getPlayerID().intValue()) + ": " + p.getWalls() + " remaining walls\n";
		}
		return first + "\n\n" + "----------------------- \n\n" + second;
	}
}
