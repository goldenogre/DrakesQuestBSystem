package com.goldenogre.battlesystem;

import java.util.ArrayList;

import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;

public class Battle {
	
	private static Enemy en;
	
	
	public Battle(Enemy enemy, int enemies, Hero hero, int heroes) {
		en = enemy;
		int enemyCount = enemies;
		int heroesCount = heroes;
		int totalCount = enemies + heroes;
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=1;i<=totalCount;i++) {
			list.add(i);
		}
		
		System.out.println("Battle initiated: ");
		System.out.println("Enemies: " + enemyCount);
		System.out.println(heroesCount > 1 ? "Heroes: " + heroesCount: "Hero: 1" );
		// System.out.println("Enemy: " + enemy.getName() );
		//System.out.println("Hero: " + hero.getName());
		System.out.println("Recieved " + attack() + " damage.");
	}
	public static void initTurn(int[]battle) {
		
		 
	}
	public static int attack() {
		int damage = en.getAttack();
		
		System.out.print("Attacking.....");
		return damage;
	}
	
}
