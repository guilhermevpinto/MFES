package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Position extends JPanel {
	
	private int x;
	private int y;
	private int width = QuaridorGui.WT * 4;
	private int height = QuaridorGui.WT * 4;
	private int row;
	private int col;
	
	public Position(int x, int y) {
		this.x = x*QuaridorGui.WT*4 + x*QuaridorGui.WT;
		this.y = y*QuaridorGui.WT*4 + y*QuaridorGui.WT;		

		this.row = 2*y + 1;
		this.col = 2*x + 1;
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Row: " + row + " Col: " + col);
            }
		});
	}
	
	public void draw () {
		repaint();
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(204,255,255,255));
		g.fillRect(0, 0, width, height);
	}
}
