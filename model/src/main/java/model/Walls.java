	package model;

	import java.awt.Rectangle;
	
public class Walls {
	
	int x,y;
		
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
