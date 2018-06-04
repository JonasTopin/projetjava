package model;

import java.awt.Rectangle;

/** Creation of the NoCross class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr
 * 
 * */
public class NoCross {
	
	int x,y;
	
	/** Define the hitbox of non mobile entity
	 *
	 * @return Box
	 * 			return the box
	 */
	public Rectangle getBounds(){ //Manage the collision
		Rectangle Box = new Rectangle (x,y,32,32);
		return Box;
	}

	/** @return x
	 * 			return x
	 */
	public int getX() {
		return x;
	}
	
	/** @return
	 * 			return x
	 * */
	
	public int getY() {
		return y;
	}
}
