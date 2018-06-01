package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Lorann extends Movements {
	public static Object lorann;
	
	Image LorannImg;
	ImageIcon iLorannDown = new ImageIcon("../sprite/lorann_b.png");
	ImageIcon iLorannDownLeft = new ImageIcon("../sprite/lorann_bl.png");
	ImageIcon iLorannDownRight = new ImageIcon("../sprite/lorann_br.png");
	ImageIcon iLorannRight = new ImageIcon("../sprite/lorann_r.png");
	ImageIcon iLorannLeft = new ImageIcon("../sprite/lorann_l.png");
	ImageIcon iLorannUp = new ImageIcon("../sprite/lorann_u.png");
	ImageIcon iLorannUpLeft = new ImageIcon("../sprite/lorann_ul.png");
	ImageIcon iLorannUpRight = new ImageIcon("../sprite/lorann_ur.png");
	
	public Lorann(int Startx,int Starty){
		this.x = Startx;
		this.y = Starty;
		
		ImageIcon iLorannImg = new ImageIcon("../sprite/lorann_b.png");
		LorannImg = iLorannImg.getImage();
	}
	
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