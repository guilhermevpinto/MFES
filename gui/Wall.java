package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.overture.codegen.runtime.VDMSeq;

import MFES.Board;

@SuppressWarnings({"serial", "unused"})
public class Wall extends JPanel {
	
	public static enum Orientation {HOR, VER};
	
	private int x;
	private int y;
	private int row;
	private int col;
	private int width;
	private int height;
	private Orientation orientation;
	private boolean set = false;
	private boolean hover = false;
	private static int hoverID = 1;
	private VDMSeq dependenthover = null;
	
	public Wall(int col, int row, int x, int y, Orientation or) {
		this.x = x;
		this.y = y;
		
		this.col = col;
		this.row = row;
		
		this.orientation = or;
		
		if (this.orientation == Orientation.HOR) {
			this.width = QuaridorGui.WT * 4;
			this.height = QuaridorGui.WT;
		}
		else if (this.orientation == Orientation.VER){
			this.width = QuaridorGui.WT;
			this.height = QuaridorGui.WT * 4;
		}
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (hover) {
					if(QuaridorGui.game.addWall((long)row, (long)col))
						QuaridorGui.next();
					else if (QuaridorGui.game.getPlayer(QuaridorGui.game.getCurrentPlayer()).getWalls().intValue() == 0)
						JOptionPane.showMessageDialog(null, "You have 0 walls to be played");
				}
			}
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				if(row != 17 & col != 17){
					dependenthover = Board.dropableWall(Board.board, (long)row, (long)col);
					
					if(dependenthover != null) {
						
						int first, second;
						first = ((Long)dependenthover.get(0)).intValue();
						second = ((Long)dependenthover.get(1)).intValue();
							
						((Wall)QuaridorGui.boardGUI.get(first-1).get(second-1)).hoverWall(QuaridorGui.game.getCurrentPlayer().intValue());

						hover = true;
						draw();
						
					}
				}
            }
			public void mouseExited(java.awt.event.MouseEvent evt) {
				if(dependenthover != null){
					
					int first, second;
					first = ((Long)dependenthover.get(0)).intValue();
					second = ((Long)dependenthover.get(1)).intValue();
						
					((Wall)QuaridorGui.boardGUI.get(first-1).get(second-1)).unhoverWall();
					dependenthover = null;
				}
				hover = false;
				draw();
            }
		});
	}

	public void draw(){
		repaint();
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(set)
			g.setColor(new Color(161,65,24,255));
		else if (hover) {
			switch (hoverID) {
			case 1:
				g.setColor(new Color(200,0,0,255));
				break;
			case 2:
				g.setColor(new Color(0,200,0,255));
				break;
			case 3:
				g.setColor(new Color(200,200,0,255));
				break;
			case 4:
				g.setColor(new Color(140,140,200,255));
				break;
			}
		}
		else
			g.setColor(new Color(250,150,120,100));
		g.fillRect(0, 0, width, height);
	}
	
	public void setWall() {
		this.set = true;
	}
	
	@SuppressWarnings("static-access")
	public void hoverWall(int playerID) {

		this.hoverID = playerID;
		this.hover = true;
		draw();
	}
	
	public void unhoverWall() {
		this.hover = false;
		draw();
	}
}
