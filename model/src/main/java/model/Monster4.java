package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster4 extends Movements{

	Image Monster4;
	
	public Monster4(int Startx, int Starty){

		x = Startx;
		y = Starty;
		
		ImageIcon iMonster4 = new ImageIcon("../sprite/monster_4.png");
		Monster4 = iMonster4.getImage();
		
	}
	
	public Image getImage(){
		return Monster4;
	}
	
}
