package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

@SuppressWarnings("serial")
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
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				hover = true;
				draw();
            }
			public void mouseExited(java.awt.event.MouseEvent evt) {
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
		if(set | hover)
			g.setColor(new Color(161,65,24,255));
		else
			g.setColor(new Color(250,150,120,100));
		g.fillRect(0, 0, width, height);
	}
	
	public void setWall() {
		this.set = true;
	}
}