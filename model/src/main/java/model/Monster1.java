package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/** Creation of the Monster1 class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr ||
 * 
 * Monsters is ennemy of Lorann, they are four in total*/

public class Monster1 extends Movements {

	Image Monster1;

	/** 
	 * @param Startx
	 * It's constructor of Monster1
	 * @param Starty 
	 * It's constructor of Monster1
	 */
	
	public Monster1(int Startx, int Starty){
		x = Startx;
		y = Starty;
	
	/** Define an image for Monster1
		*/
		
		ImageIcon iMonster1 = new ImageIcon("../sprite/monster_1.png");
		Monster1 = iMonster1.getImage();
	}
	
	/** @return Monster1 
	 * 				return Monster1*/
	
	public Image getImage(){
		return Monster1;
	}
}

