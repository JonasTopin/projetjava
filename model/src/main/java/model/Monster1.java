package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster1 extends Movements {

	Image Monster1;
	
	public Monster1(int Startx, int Starty){
		x = Startx;
		y = Starty;
		
		ImageIcon iMonster1 = new ImageIcon("../sprite/monster_1.png");
		Monster1 = iMonster1.getImage();
	}
	
	public Image getImage(){
		return Monster1;
	}
}

