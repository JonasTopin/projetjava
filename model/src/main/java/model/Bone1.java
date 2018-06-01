package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bone1 extends Walls{
	
	Image bone1;
	
	public Bone1(int Startx, int Starty){

		this.x = Startx;
		this.y = Starty;
		
		ImageIcon ibone1Img = new ImageIcon("../sprite/bone.png");
		bone1 = ibone1Img.getImage();
	}
	
	public Image getImage(){
		return bone1;
	}
}
