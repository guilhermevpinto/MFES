package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings({"serial"})
class Background extends JPanel {
	
    private Image image;

    public Background(String type) {
        readImages(type);
    }
    
    private void readImages(String type) {
		
		try {
			if(type.equals("quaridor"))
				image = ImageIO.read(HoverPanel.class.getResourceAsStream("images/quaridor.png"));
			else if(type.equals("back"))
				image = ImageIO.read(HoverPanel.class.getResourceAsStream("images/regras_background.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
    
}