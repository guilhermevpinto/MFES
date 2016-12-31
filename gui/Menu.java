package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class Menu extends JFrame{
	
	public Background backgroundImage;
	public HoverComponent hover_play;

	public Menu(String imageName) {
		init(imageName);
	}

	private void init(String imageName) {
	        
	    setBackgroundImage(imageName);
	    setHoverComponent("play");
		createOptions();

	    setTitle("Quaridor Menu");
	    setSize(615, 365);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	}
	
	public void setBackgroundImage(String filename) {
		try{
			// read image from file system
			BufferedImage myImage = ImageIO.read(new File(getClass().getResource(filename).toURI()));
			
			backgroundImage = new Background(myImage);
			setContentPane(backgroundImage);
		
		}catch (IOException e){
			e.printStackTrace();
		}catch (URISyntaxException ex){
			ex.printStackTrace();
		}
	}
	
	public void setHoverComponent(String option){
		hover_play = new HoverComponent(this, option, 224, 389, 215, 250);
		add(hover_play);
	}

    private void createOptions() {
    	
    	// adds the mouse listener to choose options on the menu
    	addMouseListener((MouseListener) hover_play);

    	// add exit icon
	    ImageIcon icon = new ImageIcon("exit.png");

	    JMenuItem eMenuItem = new JMenuItem("Exit", icon);
	    eMenuItem.setMnemonic(KeyEvent.VK_E);
	    eMenuItem.setToolTipText("Exit application");
	    eMenuItem.addActionListener((ActionEvent event) -> {
	        System.exit(0);
	    });

	}
}
