package model;

import java.awt.Rectangle;

public class NoCross {
	
	int x,y;
	
	public Rectangle getBounds(){ //g�re la collision
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
