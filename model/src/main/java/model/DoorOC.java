package model;

import java.awt.Image;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
/** Creation of the DoorOC
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr*/
public class DoorOC extends Walls{

	int x,y;

	Image Door;
	
	/**
	 * Define the door's state and its image 
	 * */
	
	String State = "CLOSED";
	ImageIcon iDoor = new ImageIcon("../sprite/gate_closed.png");
	ImageIcon iDoorOpen = new ImageIcon("../sprite/gate_open.png");

	/** 
	 * @param Startx
	 * It's the constructor of DoorOC
	 * @param Starty 
	 * It's the constructor of DoorOC
	 */
	public DoorOC (int Startx, int Starty){
		x = Startx;
		y = Starty;

	}

	/** 
 * Define position x and y 
 * @return X
 * 			return X
 * @return Y
 * 			return Y
 * 
 */
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/** Define position hitbox
	 * @return box 
	 * 			return box
	 * */
	
	public Rectangle getBounds() {
		Rectangle Box = new Rectangle(x,y,32,32);
		return Box;
	}
	
	/** Define position state of the door 
	 * @return State
	 * 			return State
	 */
	
	public String getEtat() {
		return State;
	}

	public void setEtat (String newState){
		this.State = newState;
	}
/** Condition if the door is closed, display the image of the closed door
 * Condition if the door is open, display the image of the open door
 * 
 * @return Door
 * 				return Door*/
	
	public Image getImage(){
		if(State == "CLOSED"){
			Door = iDoor.getImage();
		}
		else if (State == "OPEN"){
			Door = iDoorOpen.getImage();
		}
		return Door;

	}
}

