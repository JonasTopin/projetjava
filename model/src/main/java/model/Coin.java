package model;

import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the coin class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
public class Coin extends NoCross{
	Image Coin;
	/**
	 * 
	 * @param Startx	 
	 * It's the constructor of the Coin class
	 * @param Starty	 
	 *  It's the constructor of the Coin class
	 */ 
	 
	public Coin(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
	/** Define an image for Coin
		 */	
		
		ImageIcon iCoin = new ImageIcon("../sprite/purse.png");
		Coin = iCoin.getImage();
	}
	/**
	 * @return Bone3		  	   
	 */	
	public Image getImage(){
		return Coin;
	}

}
