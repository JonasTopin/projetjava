package model;

import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the CrystalBall class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr
 * 
 * The FireBall is the power of Lorann*/

public class FireBall extends Movements{

	Image Fireball;
	int StateFireBall = 0;
	
	/** Define the different images of FireBall*/
	
	ImageIcon iFireBall1 = new ImageIcon("../sprite/fireball_1.png");
	ImageIcon iFireBall2 = new ImageIcon("../sprite/fireball_2.png");
	ImageIcon iFireBall3 = new ImageIcon("../sprite/fireball_3.png");
	ImageIcon iFireBall4 = new ImageIcon("../sprite/fireball_4.png");
	ImageIcon iFireBall5 = new ImageIcon("../sprite/fireball_5.png");

	/** 
	 * 
	 * @param Startx
	 * It's the constructor of FireBall
	 * @param Starty
	 * It's the constructor of FireBall
	 */
	
	public FireBall(int Startx, int Starty){
		x = Startx;
		y = Starty;

		ImageIcon iFireball = new ImageIcon("../sprite/fireball_1.png");
		Fireball = iFireball.getImage();
	}
/** Define the image of the fireball to use according to its movements
 * 
 * @return Fireball 
 * 				return Fireball
*/

	public Image getImage(){
		if (StateFireBall == 0){
			Fireball = iFireBall1.getImage();
		}
		else if (StateFireBall == 1){
			Fireball = iFireBall2.getImage();
		}
		else if (StateFireBall == 2){
			Fireball = iFireBall3.getImage();
		}
		else if (StateFireBall == 4){
			Fireball = iFireBall4.getImage();
		}
		else if (StateFireBall == 5){
			Fireball = iFireBall5.getImage();
		}
		return Fireball;
	}
}
