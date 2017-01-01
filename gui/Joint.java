package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Joint extends JPanel{
	
	private int x;
	private int y;
	private int width = QuaridorGui.WT;
	private int height = QuaridorGui.WT;
	
	public Joint(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public void draw () {
		repaint();
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0,0,0,75));
		g.fillRect(0, 0, width, height);
	}
}
