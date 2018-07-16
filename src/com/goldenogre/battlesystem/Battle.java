package com.goldenogre.battlesystem;

import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;

public class Battle {
	public Battle(Enemy enemy, Hero hero) {
		System.out.println("Battle initiated: ");
		System.out.println("Enemy: " + enemy.getName() );
		System.out.println("Hero: " + hero.getName());
	}
	public static void attack(int attack, int damage) {
		
	}
}
