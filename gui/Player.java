package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Player extends JPanel {

	private int id;
	private int x;
	private int y;
	private int width = QuaridorGui.WT * 4;
	private int height = QuaridorGui.WT * 4;
	private int row;
	private int col;
	
	public Player(int id, int col, int row, int x, int y) {
		this.id = id;
		
		this.x = x;
		this.y = y;		

		this.col = col;
		this.row = row;
		
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
		
		if(this.id == 1)
			g.setColor(new Color(200,0,0,255));
		else if(this.id == 2)
			g.setColor(new Color(0,200,0,255));
		else if(this.id == 3)
			g.setColor(new Color(200,200,0,255));
		else if(this.id == 4)
			g.setColor(new Color(140,140,200,255));
		
		g.fillOval((int)(QuaridorGui.WT * 2 * 0.3), (int)(QuaridorGui.WT * 2 * 0.3), (int)(QuaridorGui.WT * 4 * 0.7), (int)(QuaridorGui.WT * 4 * 0.7));
	}
}