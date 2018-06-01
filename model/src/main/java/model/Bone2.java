package model;

import java.awt.Image;

import javax.swing.ImageIcon;


public class Bone2 extends Walls {
	
		Image bone2;
		
		public Bone2(int Startx, int Starty){

			this.x = Startx;
			this.y = Starty;
			
			ImageIcon ibone2Img = new ImageIcon("../sprite/horizontal_bone.png");
			bone2= ibone2Img.getImage();
		}
			
		public Image getImage(){
			return bone2;
		}
	}