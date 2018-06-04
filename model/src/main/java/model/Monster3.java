package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/** Creation of the Monster3 class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr ||
 * 
 * Monsters is ennemy of Lorann, they are four in total*/

public class Monster3 extends Movements{

	Image Monster3;
	
	/** 
	 * @param Startx
	 * It's the constructor of Monster3
	 * @param Starty 
	 * It's the constructor of Monster3
	 */
	
	public Monster3(int Startx, int Starty){

		x = Startx;
		y = Starty;
		
		/** Define an image for Monster3
		*/
		
		ImageIcon iMonster3 = new ImageIcon("../sprite/monster_3.png");
		Monster3 = iMonster3.getImage();
		
	}

	/**@return Monster 3 
	 * 				return Monster 3*/
	
	public Image getImage(){
		return Monster3;
	}
	
}
