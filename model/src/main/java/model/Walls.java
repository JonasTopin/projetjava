	package model;

	import java.awt.Rectangle;
	
	/** Creation of the Walls class
	 * 
	 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr
	 * 
	 * Define the hitbox
	 * 
	 * */

public class Walls {
	
	int x,y;
		/**
		 * @return Box
		 * 		return the box
		 */
		public Rectangle getBounds(){
			Rectangle Box = new Rectangle (x,y,32,32);
			return Box;
		}

		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
