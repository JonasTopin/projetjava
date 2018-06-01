package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster3 extends Movements{

	Image Monster3;
	
	public Monster3(int Startx, int Starty){

		x = Startx;
		y = Starty;
		
		ImageIcon iMonster3 = new ImageIcon("../sprite/monster_3.png");
		Monster3 = iMonster3.getImage();
		
	}

	public Image getImage(){
		return Monster3;
	}
	
}
