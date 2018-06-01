package model;
/**
 * |##################################|
 * |unit test of the different class  |
 * |##################################| 
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
	public void testConsoleP() {
		String str = "011D111011101111111111102      25552      5    22          2     65    22 1110110  2   2       22    2  2  2   2    11102  7 25 2  2   0110    22 2  2  2  2   2552   822 2 5   4  2   2 101   22 0111  2  5   2       22       2 95   2  3    2011111110111111011111110";
		

	}
	protected void setUp() throws Exception{
		String str = "011D111011101111111111102      25552      5    22          2     65    22 1110110  2   2       22    2  2  2   2    11102  7 25 2  2   0110    22 2  2  2  2   2552   822 2 5   4  2   2 101   22 0111  2  5   2       22       2 95   2  3    2011111110111111011111110";
		super.setUp();
	}

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
