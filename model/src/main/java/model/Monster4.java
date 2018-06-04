package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/** Creation of the Monster4 class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr ||
 * 
 * Monsters is ennemy of Lorann, they are four in total*/

public class Monster4 extends Movements{

	Image Monster4;
	
	/** 
	 * @param Startx
	 *  It's the constructor of Monster3
	 * @param Starty 
	 * It's the constructor of Monster3
	 */
	
	public Monster4(int Startx, int Starty){

		x = Startx;
		y = Starty;
		
		/** Define an image for Monster4
		*/
		
		ImageIcon iMonster4 = new ImageIcon("../sprite/monster_4.png");
		Monster4 = iMonster4.getImage();
		
	}
	
	/**@return Monster 4 
	 * 				return Monster 4*/
	
	public Image getImage(){
		return Monster4;
	}
	
}
