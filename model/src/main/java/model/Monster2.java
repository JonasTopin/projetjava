package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster2 extends Movements{

	Image Monster2;
	
	public Monster2(int Startx, int Starty){
		
		x = Startx;
		y = Starty;
		
		ImageIcon iMonster2 = new ImageIcon("../sprite/monster_2.png");
		Monster2 = iMonster2.getImage();
	}
	
	public Image getImage(){
		return Monster2;
	}
}
