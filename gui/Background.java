package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

<<<<<<< HEAD
class Background extends JComponent implements MouseListener{
	
    private Image image;
    
    public Background(Image image) {
        this.image = image;
=======
class Background extends JPanel {
	
    private Image image;

    public Background(String type) {
        readImages(type);
>>>>>>> master
    }
    
    private void readImages(String type) {
		
		try {
			if(type.equals("quaridor"))
				image = ImageIO.read(new File(getClass().getResource("images/quaridor.png").toURI()));
			else if(type.equals("back"))
				image = ImageIO.read(new File(getClass().getResource("images/regras_background.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
