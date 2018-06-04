package model;

import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the bone class in circles
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
public class Bone1 extends Walls{
	
	Image bone1;
	/**
	 * @param Startx	 
	 * It's the constructor of the Bone1 class
	 * @param Starty
	 * It's the constructor of the Bone1 class*/
	
	
	public Bone1(int Startx, int Starty){

		this.x = Startx;
		this.y = Starty;
		
		/** Define an image for Bone1
		 */
		
		ImageIcon ibone1Img = new ImageIcon("../sprite/bone.png");
		bone1 = ibone1Img.getImage();
	}
	/**
	 * @return Bone1		  	   
	 */	
	public Image getImage(){
		return bone1;
	}
}
