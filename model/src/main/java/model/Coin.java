package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Coin extends NoCross{
	Image Coin;
	
	public Coin(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iCoin = new ImageIcon("../sprite/purse.png");
		Coin = iCoin.getImage();
	}
	
	public Image getImage(){
		return Coin;
	}

}
