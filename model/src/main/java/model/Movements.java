package model;

import java.awt.Rectangle;

/** Creation of the Movements class
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr
 * 
 * The class defines the different possible movements*/

public class Movements {


	public int x,y;
	public String direction = "DOWN";
	
	
	/** Define the hitbox
	 * @return box
	 * 			return box*/
	
	public Rectangle getBounds(){ //getBounds for collisions
		Rectangle Box = new Rectangle(x,y,32,32);
		return Box;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDir() {
		return direction;
	}

	public void setDir(String direction) {
		this.direction = direction;
	}
	
	/** Define the different orientation*/
	
	public void move() {
		switch (this.getDir()) {
			case "UP":
				this.moveUp();
				break;
			case "RIGHT":
				this.moveRight();
				break;
			case "DOWN":
				this.moveDown();
				break;
			case "LEFT":
				this.moveLeft();
				break;
			case "UPLEFT":
				this.moveUpLeft();
				break;
			case "DOWNLEFT":
				this.moveDownLeft();
				break;
			case "UPRIGHT":
				this.moveUpRight();
				break;
			case "DOWNRIGHT":
				this.moveDownRight();
				break;
			default:
				break;
		}
	}
	
	/** Define the different movement */
	
	void moveUp() {
		this.setY(getY() - 32 );
	}

	void moveRight() {
		this.setX(getX() + 32);
	}

	void moveDown() {
		this.setY(getY() + 32 );
	}

	void moveLeft() {
		this.setX(getX() - 32 );
	}
	
	void moveUpRight() {
		this.setY(getY() - 32 );
		this.setX(getX() + 32);
	}

	void moveDownRight() {
		this.setX(getX() + 32);
		this.setY(getY() + 32 );
	}

	void moveDownLeft() {
		this.setY(getY() + 32 );
		this.setX(getX() - 32 );
	}

	void moveUpLeft() {
		this.setY(getY() - 32 );
		this.setX(getX() - 32 );
	}
}