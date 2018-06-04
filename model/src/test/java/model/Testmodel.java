package model;
/**
 * 
 * unit test of the different class  
 * 
 */
import org.junit.Test;

import junit.framework.TestCase;

public class Testmodel extends TestCase {

	@SuppressWarnings("unused")
	private ConsoleP consoleP ;
	
	public Testmodel(){
		super();
	}
	@Test
	
	public void testMonster1(){
		new Monster1(0, 0);
	}

	public void testMonster2(){
		new Monster2(0, 0);
	}
	public void testMonster3(){
		new Monster3(0, 0);
	}
	public void testMonster4(){
		new Monster4(0, 0);
	}
	public void testBone1(){
		new Bone1(0, 0);
	}
	public void testBone2(){
		new Bone2(0, 0);
	}
	public void testBone3(){
		new Bone3(0, 0);
	}
	public void testCoin(){
		new Coin(0, 0);
	}
	public void testCrystalBall(){
		new CrystalBall(0, 0);
	}
	public void testLorann(){
		new Lorann(0, 0);
	}
	public void testMovements(){
		new Movements();
	}
	public void testWalls(){
		new Walls();
	}
	public void testNoCross(){
		new NoCross();
	}
	public void testDoorOC(){
		new DoorOC(0, 0);
	}
	public void testFireBall(){
		new FireBall(0, 0);
	}
	
}
