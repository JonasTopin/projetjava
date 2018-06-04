package model;
	
import java.awt.Image;

import javax.swing.ImageIcon;
/** Creation of the vertical bone class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
	public class Bone3 extends Walls{
		
		Image bone3;
		/**
		 *
		 * @param Startx
		 * It's the constructor of the Bone3 class	 
		 * @param Starty	 
		 *  It's the constructor of the Bone3 class
		 */ 
		 
		public Bone3(int Startx, int Starty){

			this.x = Startx;
			this.y = Starty;
			
			/** Define an image for Bone3
		 */
			ImageIcon ibone3Img = new ImageIcon("../sprite/vertical_bone.png");
			bone3= ibone3Img.getImage();
		}
		/**
		 * @return Bone3		  	   
		 */	
		public Image getImage(){
			return bone3;
		}
	}

