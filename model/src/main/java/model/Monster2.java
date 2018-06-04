package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/** Creation of the Monster2 class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr ||
 * 
 * Monsters is ennemy of Lorann, they are four in total*/

public class Monster2 extends Movements{

	Image Monster2;
	
	/** 
	 * @param Startx
	 * It's the constructor of Monster2
	 * @param Starty 
	 * It's the constructor of Monster2
	 */
	public Monster2(int Startx, int Starty){
		
		x = Startx;
		y = Starty;
		
		/** Define an image for Monster2
		*/
		
		ImageIcon iMonster2 = new ImageIcon("../sprite/monster_2.png");
		Monster2 = iMonster2.getImage();
	}
	
	/** @return Monster2 
	 * 				return Monster2*/
	
	public Image getImage(){
		return Monster2;
	}
}
