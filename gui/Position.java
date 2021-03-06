package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

@SuppressWarnings({"serial","unused"})
public class Position extends JPanel {
	
	private int x;
	private int y;
	private int width = QuaridorGui.WT * 4;
	private int height = QuaridorGui.WT * 4;
	private int row;
	private int col;
	public boolean selected;
	
	public Position(int col, int row, int x, int y) {
		this.x = x;
		this.y = y;		

		this.col = col;
		this.row = row;
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(selected) {
					QuaridorGui.movePlayer(row, col);
				}
            }
		});
	}
	
	public void draw () {
		repaint();
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(selected)
			g.setColor(new Color(250,255,255,200));
		else	
			g.setColor(new Color(204,255,255,255));
		g.fillRect(0, 0, width, height);
	}
	
	public void setSelected() {
		this.selected = true;
		draw();
	}
	public void unsetSelected() {
		this.selected = false;
		draw();
	}
}