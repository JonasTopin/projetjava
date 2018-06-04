package model;

import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the CrystalBall class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
public class CrystalBall extends NoCross{
	Image CrystalBall;
	/**
	 * 
	 * @param Startx
	 * It's the constructor of the CrystallBall class 	 
	 * @param Starty	 
	 * It's the constructor of the CrystallBall class 
	 * 
	 * Define an image for CrystallBall
	 */
	public CrystalBall(int Startx, int Starty ){
		x = Startx;
		y = Starty;
		
		ImageIcon iCrystalBall = new ImageIcon("../sprite/crystal_ball.png");
		CrystalBall = iCrystalBall.getImage();
	}
	/**
	 * @return CrystallBall	
	 * 				return CrystallBall	  	   
	 */
	public Image getImage(){
		return CrystalBall;
	}
}
