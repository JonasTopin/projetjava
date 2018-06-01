package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CrystalBall extends NoCross{
	Image CrystalBall;
	
	public CrystalBall(int Startx, int Starty ){
		x = Startx;
		y = Starty;
		
		ImageIcon iCrystalBall = new ImageIcon("../sprite/crystal_ball.png");
		CrystalBall = iCrystalBall.getImage();
	}
	
	public Image getImage(){
		return CrystalBall;
	}
}
