package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

import javax.swing.JComponent;

import com.sun.javafx.geom.Rectangle;

public class HoverComponent extends JComponent implements MouseListener{
	
	private Menu menu;
    public boolean startGame = false;

	private String option;
	private int x_min;
	private int x_max;
	private int y_min;
	private int y_max;
	
	public HoverComponent(Menu menu, String option, int x_min, int x_max, int y_min, int y_max) {
		this.menu = menu;
		this.option = option;
		
		this.x_min = x_min;
		this.x_max = x_max;
		this.y_min = y_min;
		this.y_max = y_max;
		
		setup();
    }
	
	public void setup() {
		
		setLocation(x_min, y_min);
        setSize(x_max-x_min, y_max-y_min);
        System.out.println(this.getSize());
        System.out.println(this.getLocation());
	}

	@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		startGame = true;	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("OUT " + e.getX() + ", " + e.getY());
		
		if(option.equals("play"))
			menu.setBackgroundImage("images/quaridor_play.png");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(option.equals("play"))
			menu.setBackgroundImage("images/quaridor.jpg");
	}

	
	
}
