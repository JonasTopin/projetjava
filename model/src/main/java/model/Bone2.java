package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/** Creation of the horizontal bone class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
public class Bone2 extends Walls {
	
		Image bone2;
		/**
		 * 
		 * @param Startx
		 * 	 It's the constructor of the Bone2 class  
		 * @param Starty	
		 * It's the constructor of the Bone2 class  
		 */ 
		
		public Bone2(int Startx, int Starty){

			this.x = Startx;
			this.y = Starty;
			
			 /** Define an image for Bone2
		 */
			ImageIcon ibone2Img = new ImageIcon("../sprite/horizontal_bone.png");
			bone2= ibone2Img.getImage();
		}
		/**
		 * @return Bone2		  	   
		 */	
		public Image getImage(){
			return bone2;
		}
	}