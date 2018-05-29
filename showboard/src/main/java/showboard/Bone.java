package showboard;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Bone extends JPanel {
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("C:\\Users\\User\\OneDrive - Association Cesi Viacesi mail\\A1\\Projet 5\\sprite\\sprite\\bone.png"));
			g.drawImage(img, 0, 0, 32, 32, this);
			Image img2 = ImageIO.read(new File("C:\\Users\\User\\OneDrive - Association Cesi Viacesi mail\\A1\\Projet 5\\sprite\\sprite\\lorann_r.png"));
			g.drawImage(img2, 32, 32, 32, 32, this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
