package model;

import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the Lorann class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr ||
 * 
 * Lorann is the hero of the game, he must escape the level 
 * while picking up the pieces and without the monsters touch him.*/

public class Lorann extends Movements {
	public static Object lorann;
	
	/** Define the different the different angles of view of Lorann*/
	
	Image LorannImg;
	ImageIcon iLorannDown = new ImageIcon("../sprite/lorann_b.png");
	ImageIcon iLorannDownLeft = new ImageIcon("../sprite/lorann_bl.png");
	ImageIcon iLorannDownRight = new ImageIcon("../sprite/lorann_br.png");
	ImageIcon iLorannRight = new ImageIcon("../sprite/lorann_r.png");
	ImageIcon iLorannLeft = new ImageIcon("../sprite/lorann_l.png");
	ImageIcon iLorannUp = new ImageIcon("../sprite/lorann_u.png");
	ImageIcon iLorannUpLeft = new ImageIcon("../sprite/lorann_ul.png");
	ImageIcon iLorannUpRight = new ImageIcon("../sprite/lorann_ur.png");
	
	/**
	 * 
	 * @param Startx
	 * It's the constructor of Lorann class
	 * @param Starty
	 *  It's the constructor of Lorann class
	 */
	
	public Lorann(int Startx,int Starty){
		this.x = Startx;
		this.y = Starty;
		
		/** Define the basic image of Lorann */
		
		ImageIcon iLorannImg = new ImageIcon("../sprite/lorann_b.png");
		LorannImg = iLorannImg.getImage();
	}
	
	/** Define the image of Lorann according to his movements 
	 * @return LorannImg
	 * 			return LorannImg
	 * */
	
	public Image getImage(){
		if(this.getDir() == "DOWN"){ 
			LorannImg = iLorannDown.getImage();
		}
		else if (this.getDir() == "DOWNLEFT"){
			LorannImg = iLorannDownLeft.getImage();
		}
		else if (this.getDir() == "DOWNRIGHT"){
			LorannImg = iLorannDownRight.getImage();
		}
		else if (this.getDir() == "RIGHT"){
			LorannImg = iLorannRight.getImage();
		}
		else if (this.getDir() == "LEFT"){
			LorannImg = iLorannLeft.getImage();
		}
		else if (this.getDir() == "UP"){
			LorannImg = iLorannUp.getImage();
		}
		else if (this.getDir() == "UPLEFT"){
			LorannImg = iLorannUpLeft.getImage();
		}
		else if (this.getDir() == "UPRIGHT"){
			LorannImg = iLorannUpRight.getImage();
		}
		return LorannImg;
	}
	
}