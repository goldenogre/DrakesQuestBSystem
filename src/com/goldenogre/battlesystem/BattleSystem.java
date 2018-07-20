package com.goldenogre.battlesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;
/**
 * <h3>Drake's Quest Battles System v1.0.0</h3>
 * @author Damian Depuy
 * @version 1.0.0
 *
 */
public class BattleSystem {
	private static ArrayList<Enemy> en;
	private static ArrayList<Hero> he;
	private static Random rand;
	private static int hAlive;
	private static int eAlive;
	private static int alive;
	private static Scanner input;
	private static int choice;
/**
 * Starts a new battle by opening the menu options
 *  
 * @param h  The list of heroes  
 * @param e  The list of enemies
 */
	public BattleSystem(ArrayList<Hero> h, ArrayList<Enemy> e) {
		en = new ArrayList<Enemy>(e);
		he = h;

		Random rand = new Random();
		hAlive = he.size();
		eAlive = en.size();
		alive = hAlive + eAlive;
		System.out.println("Battle Commenced");
		System.out.println("Total(9): " + alive);
		menu();

	}

	public static void menu() {
		input = new Scanner(System.in);
		System.out.println("enter 1 to fight: ");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You chose fight");
			fight();
			break;
		case 2:
			System.out.println("You chose run");
			break;

		default:
			System.out.println("You did something wrong");
			break;
		}
	}

	public static void fight() {
		ArrayList<Hero> copyH = new ArrayList<Hero>(he);
		ArrayList<Enemy> copyE = new ArrayList<Enemy>(en);
		System.out.println("Battle ordering commenced");
		
		System.out.println(he);
		System.out.println(copyH);
		System.out.println(en);
		System.out.println(copyE);
		
		
		int turns = eAlive + hAlive;
		System.out.println("alive: " + alive + " eAlive: " + eAlive + " hAlive: " + hAlive );
		System.out.println("Turns expected: " + turns);
		//int heroes = hAlive;
		//int enemies = eAlive;
		
		
		Collections.shuffle(copyH);
		Collections.shuffle(copyE);
		/**
		 * Main loop: used total actors ( heroes and enemies) to determine the length
		 * of the queue. A stack or queue collection would make more sense accept I'm not sure
		 * how to implement a queue for two different objects.
		 */
		for(int i = 0;i<turns;i++) {
			System.out.print("--"+ (i+1)+" ");
			/* If getAcker is true, then hero is select.
			 * False goes to enemy.
			 */
			if(getAttacker()){ 
				if(copyH.size()==0) {
					/*
					 * Hero was chose, but there's none left. 
					 * Enemy must not go.
					 */
					boolean isDead = copyE.get(0).isDead();
					if(!isDead) { // Enemy has life, therefor it can attack.
						int index = getDefender(hAlive);
					int attack = copyE.get(0).getAttack();
					System.out.println(copyE.get(0)+" Enemy Attacks " + he.get(index) + " for " + attack+ ".");
					he.get(index).damage(attack);
					if(he.get(index).isDead()) {
						System.out.println("********** " + he.get(index) + " Died.");
						he.remove(index);
						hAlive--;
					}
					copyE.remove(0);
					} else { 
						System.out.println( copyE.get(0)+" is dead and can't attack");
					}
					
				}else {
					/* There is a hero read.
					 * 
					 */
					int index = getDefender(eAlive);
					int attack = copyH.get(0).getAttack();
					boolean isDead = he.get(0).isDead();
					if(!isDead) {
						System.out.println(copyH.get(0)+" Hero attacks " + en.get(index) + " for " + attack+".");
					en.get(index).damage(attack);
					if(en.get(index).isDead()) {
						System.out.println("********** " + en.get(index) + " Died.");
						en.remove(index);
						eAlive--;
					}
					copyH.remove(0);
					} else { // selected here died earlier that round
						System.out.println(copyH.get(0)+" is dead and can;t attack");
					}
					
				}
			} else {
				if(copyE.size()==0) { 
					int index = getDefender(eAlive);
					int attack = copyH.get(0).getAttack();
					boolean isDead = copyH.get(0).isDead();
					if(!isDead) {
						System.out.println(copyH.get(0)+" Hero attacks " + en.get(index) + " for " + attack+".");
					en.get(index).damage(attack);
					if(en.get(index).isDead()) {
						System.out.println("********** " + en.get(index) + " Died.");
						en.remove(index);
						eAlive--;
					}
					copyH.remove(0);
					} else {
						System.out.println(copyH.get(0)+" is dead and can't fight");
					}
					
				} else {
					int index = getDefender(hAlive); // Enemy goes first 
					int attack = copyE.get(0).getAttack();
					boolean isDead = copyE.get(0).isDead();
					if(!isDead) {
						System.out.println(copyE.get(0)+" Enemy Attacks " + he.get(index) + " for " + attack+ ".");
					he.get(index).damage(attack);
					if(he.get(index).isDead()) {
						System.out.println("********** " + he.get(index) + " Died.");
						he.remove(index);
						hAlive--;
					}
					copyE.remove(0);
					} else {
						System.out.println(copyE.get(0)+ " is dead and can't attack");
					}
					
				}
				
			}
			
			
		}
		
		
		
		if(eAlive==0 && hAlive>0) {
			System.out.println("You win!");
		} 
		if(hAlive==0) {
			System.out.println("Game Over!");
			
		} else {
			menu();
		}
		//menu();
		
	}
	public static boolean getAttacker() {
		boolean isHero= false;
		rand = new Random();
		
		if(rand.nextBoolean()) {
			
			isHero=true;
		} 
		return isHero;
	}
	public static int getDefender(int defenders) {
		int Max = defenders;
		int Min =0;
		int index = Min + (int)(Math.random() * ((Max - Min) ));
		
		
		return index;
	}
//		rand = new Random();
//		Collections.shuffle(en);
//		System.out.println("Battle Start");

//		
//		
//		int hTurns = hAlive;
//		int eTurns = eAlive;
////		
//		System.out.println("Total turns expected: " + alive);
//		
////		
//		
//		
//		while(hTurns>0 || eTurns>0) {
//			if (rand.nextBoolean()||hTurns==0) {
//				// enemy
//				
//				if(hTurns>0) {
//					System.out.println(en.get(eTurns-1) + " Attacks " + he.get(hTurns-1) + " for " + en.get(eTurns-1).getAttack() + "\n");
//					he.get(hTurns-1).damage(en.get(eTurns-1).getAttack());
//				} else {
//					System.out.println(en.get(eTurns) + " Attacks " + he.get(hTurns) + " for " + en.get(eTurns).getAttack() + "\n");
//					he.get(hTurns).damage(en.get(eTurns).getAttack());
//				}
//				eTurns--;
////				if (he.get(hTurns).isDead()) {
////					System.out.println("*********** " + he.remove(0) + " Died\n");
////					eTurns--;
////				}
//			} else {
//				//hero goes
//				
//				
//				if(eTurns>0) {
//					System.out.println(he.get(hTurns-1)+" attacks " + en.get(eTurns-1)+ " for " + he.get(hTurns-1).getAttack());
//					en.get(eTurns-1).damage(he.get(hTurns-1).getAttack());
//				} else {
//					System.out.println(he.get(hTurns)+" attacks " + en.get(eTurns)+ " for " + he.get(hTurns).getAttack());
//					en.get(eTurns).damage(he.get(hTurns).getAttack());
//				}
//				hTurns--;
//				
//			}
//
//			
//		}
//		
//		System.out.println("End turn\n");
//
//		// }
//		
//		menu();
//		// System.out.println("Hero: " + h.get(0).getName());
//	}

}
