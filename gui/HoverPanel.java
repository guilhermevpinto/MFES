package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class HoverPanel extends JPanel {
	
	private Image nohover;
	private Image hover;
	private Image image;
	
	volatile Boolean click_state = false;
	
	public HoverPanel(String type) {
		readImages(type);
		image = nohover;
		listener();
	}
	
	private void readImages(String type) {
		
		try {
			if(type.equals("jogar")){
				nohover = ImageIO.read(new File(getClass().getResource("images/jogar.png").toURI()));
				hover = ImageIO.read(new File(getClass().getResource("images/jogar_hover.png").toURI()));
			}else if(type.equals("regras")){
				nohover = ImageIO.read(new File(getClass().getResource("images/regras.png").toURI()));
				hover = ImageIO.read(new File(getClass().getResource("images/regras_hover.png").toURI()));
			}else if(type.equals("back")){
				nohover = ImageIO.read(new File(getClass().getResource("images/back.png").toURI()));
				hover = ImageIO.read(new File(getClass().getResource("images/back_hover.png").toURI()));
			}
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
	public Boolean getState(){
		return click_state;
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
	
	private void listener() {
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e){
				click_state = true;
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				image = hover;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				image = nohover;
				repaint();
			}
        });
	}

}
