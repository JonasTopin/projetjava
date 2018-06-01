package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConsoleP extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;
	String Game[][] = new String[24][24];
	int gold = 0;

	boolean shoot = false;
	boolean touch = false;
	boolean prisond1 = false;
	boolean prisond2 = false;
	boolean prisond3 = false;
	boolean prisond4 = false;

	private static ArrayList<Bone1> Bones1;
	private static ArrayList<Bone2> Bones2;
	private static ArrayList<Bone3> Bones3;
	private static ArrayList<CrystalBall> CrystalBalls;
	private static ArrayList<Coin> Coins;
	private static ArrayList<Monster1> Monsters1;
	private static ArrayList<Monster2> Monsters2;
	private static ArrayList<Monster3> Monsters3;
	private static ArrayList<Monster4> Monsters4;
	private static ArrayList<DoorOC> DoorsOC;
	private static ArrayList<FireBall> FireBalls;

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	Bone1 bone1;
	Bone2 bone2;
	Bone3 bone3;
	Lorann lorann;
	CrystalBall crystalball;
	Coin coin;
	Monster1 monster1;
	Monster2 monster2;
	Monster3 monster3;
	Monster4 monster4;
	DoorOC doorOC;
	FireBall fireball;
	FileReader fr;
	Font levelFont = new Font("Calibri", Font.BOLD, 28);

	public ConsoleP() {
		this.setBackground(Color.BLACK);
		gold = 0;
		LevelMaker();
		setFocusable(true);
		addKeyListener(this);
	}

	protected void LevelMaker() {
		try {

			fr = new FileReader(
					"C:\\Users\\Eloïse\\OneDrive - Association Cesi Viacesi mail\\Année 2017-2018\\Projet\\Projet Java\\Lorann\\Maps\\level1.txt");

			int x = 0, y = 0, i = 0;
			touch = false;
			shoot = false;
			prisond1 = false;
			prisond2 = false;
			prisond3 = false;
			prisond4 = false;

			Bones1 = new ArrayList<Bone1>();
			Bones2 = new ArrayList<Bone2>();
			Bones3 = new ArrayList<Bone3>();
			CrystalBalls = new ArrayList<CrystalBall>();
			Coins = new ArrayList<Coin>();
			Monsters1 = new ArrayList<Monster1>();
			Monsters2 = new ArrayList<Monster2>();
			Monsters3 = new ArrayList<Monster3>();
			Monsters4 = new ArrayList<Monster4>();
			DoorsOC = new ArrayList<DoorOC>();
			FireBalls = new ArrayList<FireBall>();

			while ((i = fr.read()) != -1) {
				char strImg = (char) i;

				switch (strImg) {
				case '0':
					Game[x][y] = "WALLS";
					bone1 = new Bone1(x * 32, y * 32);
					Bones1.add(bone1);
					break;

				case '1':
					Game[x][y] = "WALLS";
					bone2 = new Bone2(x * 32, y * 32);
					Bones2.add(bone2);
					break;

				case '2':
					Game[x][y] = "WALLS";
					bone3 = new Bone3(x * 32, y * 32);
					Bones3.add(bone3);
					break;

				case '3':
					Game[x][y] = "LORANN";
					lorann = new Lorann(x * 32, y * 32);
					break;

				case '4':
					Game[x][y] = "CRYSTALBALL";
					crystalball = new CrystalBall(x * 32, y * 32);
					CrystalBalls.add(crystalball);
					break;

				case '5':
					Game[x][y] = "COIN";
					coin = new Coin(x * 32, y * 32);
					Coins.add(coin);
					break;

				case '6':
					Game[x][y] = "MONSTER1";
					monster1 = new Monster1(x * 32, y * 32);
					Monsters1.add(monster1);
					break;

				case '7':
					Game[x][y] = "MONSTER2";
					monster2 = new Monster2(x * 32, y * 32);
					Monsters2.add(monster2);
					break;

				case '8':
					Game[x][y] = "MONSTER3";
					monster3 = new Monster3(x * 32, y * 32);
					Monsters3.add(monster3);
					break;

				case '9':
					Game[x][y] = "MONSTER4";
					monster4 = new Monster4(x * 32, y * 32);
					Monsters4.add(monster4);
					break;

				case 'D':
					Game[x][y] = "DOOROC";
					doorOC = new DoorOC(x * 32, y * 32);
					DoorsOC.add(doorOC);
					break;

				case ' ':
					Game[x][y] = null;
					break;

				default:

				}

				if (strImg == '\r' || strImg == '\n') {
					x--;
				}
				if (x == 23) {
					y++;
					x = 0;
				} else {
					x++;
				}

			}
		} catch (Exception ex) {
			repaint();
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		for (int i = 0; i < Bones1.size(); i++) {
			bone1 = (Bone1) Bones1.get(i);
			g2d.drawImage(bone1.getImage(), bone1.getX(), bone1.getY(), null);
		}
		for (int i = 0; i < Bones2.size(); i++) {
			bone2 = (Bone2) Bones2.get(i);
			g2d.drawImage(bone2.getImage(), bone2.getX(), bone2.getY(), null);
		}
		for (int i = 0; i < Bones3.size(); i++) {
			bone3 = (Bone3) Bones3.get(i);
			g2d.drawImage(bone3.getImage(), bone3.getX(), bone3.getY(), null);
		}
		for (int i = 0; i < CrystalBalls.size(); i++) {
			crystalball = (CrystalBall) CrystalBalls.get(i);
			g2d.drawImage(crystalball.getImage(), crystalball.getX(), crystalball.getY(), null);
		}
		for (int i = 0; i < Coins.size(); i++) {
			coin = (Coin) Coins.get(i);
			g2d.drawImage(coin.getImage(), coin.getX(), coin.getY(), null);
		}
		for (int i = 0; i < Monsters1.size(); i++) {
			monster1 = (Monster1) Monsters1.get(i);
			g2d.drawImage(monster1.getImage(), monster1.getX(), monster1.getY(), null);
		}
		for (int i = 0; i < Monsters2.size(); i++) {
			monster2 = (Monster2) Monsters2.get(i);
			g2d.drawImage(monster2.getImage(), monster2.getX(), monster2.getY(), null);
		}
		for (int i = 0; i < Monsters3.size(); i++) {
			monster3 = (Monster3) Monsters3.get(i);
			g2d.drawImage(monster3.getImage(), monster3.getX(), monster3.getY(), null);
		}
		for (int i = 0; i < Monsters4.size(); i++) {
			monster4 = (Monster4) Monsters4.get(i);
			g2d.drawImage(monster4.getImage(), monster4.getX(), monster4.getY(), null);
		}
		for (int i = 0; i < FireBalls.size(); i++) {
			fireball = (FireBall) FireBalls.get(i);
			g2d.drawImage(fireball.getImage(), fireball.getX(), fireball.getY(), null);
		}

		try {
			g2d.drawImage(lorann.getImage(), lorann.getX(), lorann.getY(), null);
			g2d.drawImage(doorOC.getImage(), doorOC.getX(), doorOC.getY(), null);
		} catch (Exception ex) {
		}
		g.setColor(Color.YELLOW);
		g.setFont(levelFont);
		g.drawString("Gold : " + gold, 240, 400);

		repaint();
	}

	public boolean CheckCollision(String direction) {
		Rectangle lorannRec;
		lorannRec = lorann.getBounds();

		switch (direction) {
		case "RIGHT":
			lorannRec.setBounds(lorannRec.x + 32, lorannRec.y, lorannRec.width, lorannRec.height);
			break;

		case "LEFT":
			lorannRec.setBounds(lorannRec.x - 32, lorannRec.y, lorannRec.width, lorannRec.height);
			break;

		case "UP":
			lorannRec.setBounds(lorannRec.x, lorannRec.y - 32, lorannRec.width, lorannRec.height);
			break;

		case "DOWN":
			lorannRec.setBounds(lorannRec.x, lorannRec.y + 32, lorannRec.width, lorannRec.height);
			break;

		case "DOWNLEFT":
			lorannRec.setBounds(lorannRec.x - 32, lorannRec.y + 32, lorannRec.width, lorannRec.height);
			break;

		case "DOWNRIGHT":
			lorannRec.setBounds(lorannRec.x + 32, lorannRec.y + 32, lorannRec.width, lorannRec.height);
			break;

		case "UPLEFT":
			lorannRec.setBounds(lorannRec.x - 32, lorannRec.y - 32, lorannRec.width, lorannRec.height);
			break;

		case "UPRIGHT":
			lorannRec.setBounds(lorannRec.x + 32, lorannRec.y - 32, lorannRec.width, lorannRec.height);
			break;

		default:
		}

		for (int i = 0; i < Bones1.size(); i++) {
			bone1 = (Bone1) Bones1.get(i);
			Rectangle bone1Rec = bone1.getBounds();
			if (lorannRec.intersects(bone1Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Bones2.size(); i++) {
			bone2 = (Bone2) Bones2.get(i);
			Rectangle bone2Rec = bone2.getBounds();
			if (lorannRec.intersects(bone2Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Bones3.size(); i++) {
			bone3 = (Bone3) Bones3.get(i);
			Rectangle bone3Rec = bone3.getBounds();
			if (lorannRec.intersects(bone3Rec)) {
				return true;
			}
		}
		for (int i = 0; i < FireBalls.size(); i++) {
			fireball = (FireBall) FireBalls.get(i);
			Rectangle sortilegesRec = fireball.getBounds();
			if (lorannRec.intersects(sortilegesRec)) {
				touch = false;
				shoot = false;
				fireball.setX(1000);
				fireball.setY(400);
			}
		}
		return false;
	}

	public void Shoot() {

		if (shoot == true) {
			switch (lorann.getDir()) {
			case "DOWN":
				fireball.setY(lorann.getY() - 32);
				fireball.setX(lorann.getX());
				fireball.setDir("UP");
				break;

			case "UP":
				fireball.setY(lorann.getY() + 32);
				fireball.setX(lorann.getX());
				fireball.setDir("DOWN");
				break;

			case "LEFT":
				fireball.setY(lorann.getY());
				fireball.setX(lorann.getX() + 32);
				fireball.setDir("RIGHT");
				break;

			case "RIGHT":
				fireball.setY(lorann.getY());
				fireball.setX(lorann.getX() - 32);
				fireball.setDir("LEFT");
				break;

			case "DOWNRIGHT":
				fireball.setY(lorann.getY() - 32);
				fireball.setX(lorann.getX() - 32);
				fireball.setDir("UPLEFT");
				break;

			case "DOWNLEFT":
				fireball.setY(lorann.getY() - 32);
				fireball.setX(lorann.getX() + 32);
				fireball.setDir("UPRIGHT");
				break;

			case "UPRIGHT":
				fireball.setY(lorann.getY() + 32);
				fireball.setX(lorann.getX() - 32);
				fireball.setDir("UPLEFT");
				break;

			case "UPLEFT":
				fireball.setY(lorann.getY() + 32);
				fireball.setX(lorann.getX() + 32);
				fireball.setDir("DOWNRIGHT");
				break;
			}
		}

	}

	public void FollowShoot() {

		if (shoot == true) {
			if (fireball.StateFireBall > 4)
				fireball.StateFireBall = 0;
			if (fireball.getDir() == "RIGHT") {
				if (CheckFireBall("RIGHT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "LEFT") {

				if (CheckFireBall("LEFT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "UP") {
				if (CheckFireBall("UP") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}

			} else if (fireball.getDir() == "DOWN") {
				if (CheckFireBall("DOWN") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "DOWNLEFT") {
				if (CheckFireBall("DOWNLEFT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "DOWNRIGHT") {
				if (CheckFireBall("DOWNRIGHT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "UPRIGHT") {
				if (CheckFireBall("UPRIGHT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			} else if (fireball.getDir() == "UPLEFT") {
				if (CheckFireBall("UPLEFT") == false && touch == false) {
					fireball.StateFireBall++;
					fireball.move();
				} else {
					touch = true;
				}

				if (touch == true) {
					CheckFireBall(fireball.getDir());
					fireball.StateFireBall++;
					pathToLorann1(fireball);
					FireBallRemove();
				}
			}
		}
	}

	public boolean MonsterEat(Movements movements) {
		Rectangle movementsRec;
		movementsRec = movements.getBounds();
		if (movements.getX() < lorann.getX()) {
			movementsRec.setBounds(movementsRec.x + 32, movementsRec.y, movementsRec.width, movementsRec.height);
		} else if (movements.getX() > lorann.getX()) {
			movementsRec.setBounds(movementsRec.x - 32, movementsRec.y, movementsRec.width, movementsRec.height);
		} else if (movements.getY() > lorann.getY()) {
			movementsRec.setBounds(movementsRec.x, movementsRec.y - 32, movementsRec.width, movementsRec.height);
		} else if (movements.getY() < lorann.getY()) {
			movementsRec.setBounds(movementsRec.x, movementsRec.y + 32, movementsRec.width, movementsRec.height);
		}

		Rectangle lorannRec;
		lorannRec = lorann.getBounds();
		if (movementsRec.intersects(lorannRec)) {
			gold = 0;
			LevelMaker();
			return true;
		}

		return false;
	}

	public boolean FireBallRemove() {
		Rectangle sortilegesRec;
		sortilegesRec = fireball.getBounds();
		if (fireball.getX() < lorann.getX()) {
			sortilegesRec.setBounds(sortilegesRec.x + 32, sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
		} else if (fireball.getX() > lorann.getX()) {
			sortilegesRec.setBounds(sortilegesRec.x - 32, sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
		} else if (fireball.getY() > lorann.getY()) {
			sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y - 32, sortilegesRec.width, sortilegesRec.height);
		} else if (fireball.getY() < lorann.getY()) {
			sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y + 32, sortilegesRec.width, sortilegesRec.height);
		}
		Rectangle lorannRec;
		lorannRec = lorann.getBounds();
		if (sortilegesRec.intersects(lorannRec)) {
			touch = false;
			shoot = false;
			fireball.setX(1000);
			fireball.setY(400);
			FireBalls.remove(0);
			return true;
		}
		return false;
	}

	public void Bank() {
		Rectangle lorannRec;
		lorannRec = lorann.getBounds();
		for (int i = 0; i < Coins.size(); i++) {
			coin = (Coin) Coins.get(i);
			Rectangle boursesRec = coin.getBounds();

			if (lorannRec.intersects(boursesRec)) {
				Coins.remove(i);
				gold = gold + 50;
				break;
			}
		}

		for (int i = 0; i < CrystalBalls.size(); i++) {
			crystalball = (CrystalBall) CrystalBalls.get(i);
			Rectangle bankRec = crystalball.getBounds();
			if (lorannRec.intersects(bankRec)) {
				CrystalBalls.remove(i);
				doorOC.setEtat("OPEN");
			}
		}

		for (int i = 0; i < DoorsOC.size(); i++) {
			doorOC = (DoorOC) DoorsOC.get(i);
			Rectangle ouvertRec = doorOC.getBounds();

			if (lorannRec.intersects(ouvertRec)) {
				if (doorOC.getEtat() == "CLOSED") {
					LevelMaker();
				}
				if (doorOC.getEtat() == "OPEN") {

					if (JOptionPane.showConfirmDialog(this, "Do you want to retry?", "",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						LevelMaker();
						gold = 0;
					} else {
						JOptionPane.showMessageDialog(null, "See you soon !", null, JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
				}
			}
		}
	}

	public boolean MonsterCollision(String direction, Movements movements) {
		Rectangle movementsRec;
		movementsRec = movements.getBounds();

		switch (direction) {
		case "RIGHT":
			movementsRec.setBounds(movementsRec.x + 32, movementsRec.y, movementsRec.width, movementsRec.height);
			break;

		case "LEFT":
			movementsRec.setBounds(movementsRec.x - 32, movementsRec.y, movementsRec.width, movementsRec.height);
			break;

		case "UP":
			movementsRec.setBounds(movementsRec.x, movementsRec.y - 32, movementsRec.width, movementsRec.height);
			break;

		case "DOWN":
			movementsRec.setBounds(movementsRec.x, movementsRec.y + 32, movementsRec.width, movementsRec.height);
			break;

		case "DOWNLEFT":
			movementsRec.setBounds(movementsRec.x - 32, movementsRec.y + 32, movementsRec.width, movementsRec.height);
			break;

		case "DOWNRIGHT":
			movementsRec.setBounds(movementsRec.x + 32, movementsRec.y + 32, movementsRec.width, movementsRec.height);
			break;

		case "UPLEFT":
			movementsRec.setBounds(movementsRec.x - 32, movementsRec.y - 32, movementsRec.width, movementsRec.height);
			break;

		case "UPRIGHT":
			movementsRec.setBounds(movementsRec.x + 32, movementsRec.y - 32, movementsRec.width, movementsRec.height);
			break;
		}

		for (int i = 0; i < Bones1.size(); i++) {
			bone1 = (Bone1) Bones1.get(i);
			Rectangle bone1Rec = bone1.getBounds();
			if (movementsRec.intersects(bone1Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Bones2.size(); i++) {
			bone2 = (Bone2) Bones2.get(i);
			Rectangle bone2Rec = bone2.getBounds();
			if (movementsRec.intersects(bone2Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Bones3.size(); i++) {
			bone3 = (Bone3) Bones3.get(i);
			Rectangle bone3Rec = bone3.getBounds();
			if (movementsRec.intersects(bone3Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Monsters1.size(); i++) {
			monster1 = (Monster1) Monsters1.get(i);
			Rectangle monster1Rec = monster1.getBounds();
			if (movementsRec.intersects(monster1Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Monsters2.size(); i++) {
			monster2 = (Monster2) Monsters2.get(i);
			Rectangle monster2Rec = monster2.getBounds();
			if (movementsRec.intersects(monster2Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Monsters3.size(); i++) {
			monster3 = (Monster3) Monsters3.get(i);
			Rectangle monster3Rec = monster3.getBounds();
			if (movementsRec.intersects(monster3Rec)) {
				return true;
			}
		}
		for (int i = 0; i < Monsters4.size(); i++) {
			monster4 = (Monster4) Monsters4.get(i);
			Rectangle monster4Rec = monster4.getBounds();
			if (movementsRec.intersects(monster4Rec)) {
				return true;
			}
		}

		if (movements == monster1) {
			for (int i = 0; i < FireBalls.size(); i++) {
				fireball = (FireBall) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (movementsRec.intersects(sortilegesRec)) {
					touch = true;
					prisond1 = true;
					monster1.setX(33);
					monster1.setY(385);
					Monsters1.remove(0);
					return true;
				}
			}
		}

		else if (movements == monster2) {
			for (int i = 0; i < FireBalls.size(); i++) {
				fireball = (FireBall) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (movementsRec.intersects(sortilegesRec)) {
					touch = true;
					prisond2 = true;
					monster2.setX(97);
					monster2.setY(385);
					Monsters2.remove(0);
					return true;
				}
			}
		} else if (movements == monster3) {
			for (int i = 0; i < FireBalls.size(); i++) {
				fireball = (FireBall) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (movementsRec.intersects(sortilegesRec)) {
					touch = true;
					prisond3 = true;
					monster3.setX(161);
					monster3.setY(385);
					Monsters3.remove(0);
					return true;
				}
			}
		} else if (movements == monster4) {
			for (int i = 0; i < FireBalls.size(); i++) {
				fireball = (FireBall) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (movementsRec.intersects(sortilegesRec)) {
					touch = true;
					prisond4 = true;
					monster4.setX(225);
					monster4.setY(385);
					Monsters4.remove(0);
					return true;
				}
			}
		}
		return false;

	}

	public boolean CheckFireBall(String direction) {

		if (shoot == true) {
			Rectangle sortilegesRec;
			sortilegesRec = fireball.getBounds();

			switch (direction) {
			case "RIGHT":
				sortilegesRec.setBounds(sortilegesRec.x + 32, sortilegesRec.y, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "LEFT":
				sortilegesRec.setBounds(sortilegesRec.x - 32, sortilegesRec.y, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "UP":
				sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y - 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "DOWN":
				sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y + 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "DOWNLEFT":
				sortilegesRec.setBounds(sortilegesRec.x - 32, sortilegesRec.y + 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "DOWNRIGHT":
				sortilegesRec.setBounds(sortilegesRec.x + 32, sortilegesRec.y + 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "UPLEFT":
				sortilegesRec.setBounds(sortilegesRec.x - 32, sortilegesRec.y - 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			case "UPRIGHT":
				sortilegesRec.setBounds(sortilegesRec.x + 32, sortilegesRec.y - 32, sortilegesRec.width,
						sortilegesRec.height);
				break;

			}

			for (int i = 0; i < Bones1.size(); i++) {
				bone1 = (Bone1) Bones1.get(i);
				Rectangle bone1Rec = bone1.getBounds();
				if (sortilegesRec.intersects(bone1Rec)) {
					return true;
				}
			}
			for (int i = 0; i < Bones2.size(); i++) {
				bone2 = (Bone2) Bones2.get(i);
				Rectangle bone2Rec = bone2.getBounds();
				if (sortilegesRec.intersects(bone2Rec)) {
					return true;
				}
			}
			for (int i = 0; i < Bones3.size(); i++) {
				bone3 = (Bone3) Bones3.get(i);
				Rectangle bone3Rec = bone3.getBounds();
				if (sortilegesRec.intersects(bone3Rec)) {
					return true;
				}
			}

			for (int i = 0; i < Monsters1.size(); i++) {
				monster1 = (Monster1) Monsters1.get(i);
				Rectangle monster1Rec = monster1.getBounds();
				if (sortilegesRec.intersects(monster1Rec)) {
					touch = true;
					prisond1 = true;
					monster1.setX(33);
					monster1.setY(385);
					Monsters1.remove(0);
					return true;
				}
			}

			for (int i = 0; i < Monsters2.size(); i++) {
				monster2 = (Monster2) Monsters2.get(i);
				Rectangle monster2Rec = monster2.getBounds();
				if (sortilegesRec.intersects(monster2Rec)) {
					touch = true;
					prisond2 = true;
					monster2.setX(97);
					monster2.setY(385);
					Monsters2.remove(0);
					return true;
				}
			}

			for (int i = 0; i < Monsters3.size(); i++) {
				monster3 = (Monster3) Monsters3.get(i);
				Rectangle monster3Rec = monster3.getBounds();
				if (sortilegesRec.intersects(monster3Rec)) {
					touch = true;
					prisond3 = true;
					monster3.setX(161);
					monster3.setY(385);
					Monsters3.remove(0);
					return true;
				}
			}
			for (int i = 0; i < Monsters4.size(); i++) {
				monster4 = (Monster4) Monsters4.get(i);
				Rectangle monster4Rec = monster4.getBounds();
				if (sortilegesRec.intersects(monster4Rec)) {
					touch = true;
					prisond4 = true;
					monster4.setX(225);
					monster4.setY(385);
					Monsters4.remove(0);
					return true;
				}
			}

		}
		return false;
	}

	public void pathToLorann1(Movements movements) {

		int PlusRapide;
		PlusRapide = 1500;

		if (!MonsterCollision("UPLEFT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() - 32)))
					+ Math.abs((lorann.getY() - (movements.getY() - 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() - 32)))
						+ Math.abs((lorann.getY() - (movements.getY() - 32)));
				movements.setDir("UPLEFT");
			}
		}
		if (!MonsterCollision("UPRIGHT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 32)))
					+ Math.abs((lorann.getY() - (movements.getY() - 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 32)))
						+ Math.abs((lorann.getY() - (movements.getY() - 32)));
				movements.setDir("UPRIGHT");
			}
		}
		if (!MonsterCollision("DOWNLEFT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() - 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() - 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 32)));
				movements.setDir("DOWNLEFT");
			}
		}
		if (!MonsterCollision("DOWNRIGHT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 32)));
				movements.setDir("DOWNRIGHT");
			}
		}

		if (!MonsterCollision("DOWN", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 0)))
					+ Math.abs((lorann.getY() - (movements.getY() + 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 0)))
						+ Math.abs((lorann.getY() - (movements.getY() + 32)));
				movements.setDir("DOWN");
			}
		}

		if (!MonsterCollision("LEFT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() - 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 0)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() - 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 0)));
				movements.setDir("LEFT");
			}
		}

		if (!MonsterCollision("UP", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 0)))
					+ Math.abs((lorann.getY() - (movements.getY() - 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 0)))
						+ Math.abs((lorann.getY() - (movements.getY() - 32)));
				movements.setDir("UP");
			}
		}

		if (!MonsterCollision("RIGHT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 0)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 0)));
				movements.setDir("RIGHT");
			}
		}
		switch (movements.getDir()) {

		case "UPLEFT":
			movements.move();
			break;

		case "UPRIGHT":
			movements.move();
			break;

		case "DOWNLEFT":
			movements.move();
			break;

		case "DOWNRIGHT":
			movements.move();
			break;

		case "DOWN":
			movements.move();
			break;

		case "LEFT":
			movements.move();
			break;

		case "UP":
			movements.move();
			break;

		case "RIGHT":
			movements.move();
			break;

		default:
			break;
		}
	}

	public void pathToLorann2(Movements movements) {

		int PlusRapide;
		PlusRapide = 1500;

		if (!MonsterCollision("UPLEFT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() - 32)))
					+ Math.abs((lorann.getY() - (movements.getY() - 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() - 32)))
						+ Math.abs((lorann.getY() - (movements.getY() - 32)));
				movements.setDir("UPLEFT");
			}
		}
		if (!MonsterCollision("UPRIGHT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 32)))
					+ Math.abs((lorann.getY() - (movements.getY() - 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 32)))
						+ Math.abs((lorann.getY() - (movements.getY() - 32)));
				movements.setDir("UPRIGHT");
			}
		}
		if (!MonsterCollision("DOWNLEFT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() - 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() - 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 32)));
				movements.setDir("DOWNLEFT");
			}
		}
		if (!MonsterCollision("DOWNRIGHT", movements)) {
			if (PlusRapide > Math.abs((lorann.getX() - (movements.getX() + 32)))
					+ Math.abs((lorann.getY() - (movements.getY() + 32)))) {
				PlusRapide = Math.abs((lorann.getX() - (movements.getX() + 32)))
						+ Math.abs((lorann.getY() - (movements.getY() + 32)));
				movements.setDir("DOWNRIGHT");
			}
		}

		switch (movements.getDir()) {

		case "UPLEFT":
			movements.move();
			break;

		case "UPRIGHT":
			movements.move();
			break;

		case "DOWNLEFT":
			movements.move();
			break;

		case "DOWNRIGHT":
			movements.move();
			break;

		default:
			break;
		}
	}

	public void pathToLorann3(Movements movements) {
		if (movements.getX() < lorann.getX()) {
			if (!MonsterCollision("RIGHT", movements)) {
				movements.setDir("RIGHT");
				movements.move();
			}
		} else if (movements.getX() > lorann.getX()) {
			if (!MonsterCollision("LEFT", movements)) {
				movements.setDir("LEFT");
				movements.move();
			}
		} else if (movements.getX() == lorann.getX()) {
			if (movements.getY() > lorann.getY()) {
				if (!MonsterCollision("UP", movements)) {
					movements.setDir("UP");
					movements.move();
				}
			} else if (movements.getY() < lorann.getY()) {
				if (!MonsterCollision("DOWN", movements)) {
					movements.setDir("DOWN");
					movements.move();
				}
			}
		}
	}

	public void pathToLorann4(Movements movements) {

		if (movements.getY() < lorann.getY()) {
			if (!MonsterCollision("DOWN", movements)) {
				movements.setDir("DOWN");
				movements.move();
			}
		} else if (movements.getY() > lorann.getY()) {
			if (!MonsterCollision("UP", movements)) {
				movements.setDir("UP");
				movements.move();
			}
		} else if (movements.getY() == lorann.getY()) {
			if (movements.getX() > lorann.getX()) {
				if (!MonsterCollision("LEFT", movements)) {
					movements.setDir("LEFT");
					movements.move();
				}
			} else if (movements.getY() < lorann.getY()) {
				if (!MonsterCollision("RIGHT", movements)) {
					movements.setDir("RIGHT");
					movements.move();
				}
			}
		}
	}

	public void keyPressed(KeyEvent arg0) {
		int Key = arg0.getKeyCode();
		int x = 0;
		int y = 0;

		if (Key == KeyEvent.VK_S || Key == KeyEvent.VK_DOWN) {
			if (!CheckCollision("DOWN")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("DOWN");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);

		} else if (Key == KeyEvent.VK_Z || Key == KeyEvent.VK_UP) {
			if (!CheckCollision("UP")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("UP");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_D || Key == KeyEvent.VK_RIGHT) {
			if (!CheckCollision("RIGHT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("RIGHT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_Q || Key == KeyEvent.VK_LEFT) {
			if (!CheckCollision("LEFT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("LEFT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_A) {
			if (!CheckCollision("UPLEFT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("UPLEFT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_E) {
			if (!CheckCollision("UPRIGHT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("UPRIGHT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_W) {
			if (!CheckCollision("DOWNLEFT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("DOWNLEFT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_X) {
			if (!CheckCollision("DOWNRIGHT")) {
				if (!MonsterEat(monster1)) {
					if (!MonsterEat(monster2)) {
						if (!MonsterEat(monster3)) {
							if (!MonsterEat(monster4)) {
								lorann.setDir("DOWNRIGHT");
								lorann.move();
								Bank();
							}
						}
					}
				}
			}
			FollowShoot();
			if (!prisond1)
				pathToLorann1(monster1);
			if (!prisond2)
				pathToLorann2(monster2);
			if (!prisond3)
				pathToLorann3(monster3);
			if (!prisond4)
				pathToLorann4(monster4);
		} else if (Key == KeyEvent.VK_SPACE) {

			if (shoot == false) {
				shoot = true;
				fireball = new FireBall(x * 32, y * 32);
				FireBalls.add(fireball);
				Shoot();
			} else if (shoot == true) {
				{
					FireBallRemove();
					touch = true;
				}
			}
		} else if (Key == KeyEvent.VK_R) {
			LevelMaker();
		}

		repaint();
	}
}
