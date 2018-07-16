package com.goldenogre.battlesystem;

import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;

public class Battle {
	public Battle(Enemy enemy, Hero hero) {
		System.out.println("Battle initiated: ");
		System.out.println("Enemy: " + enemy.getName() );
		System.out.println("Hero: " + hero.getName());
		System.out.println("Recieved " + attack(enemy.getAttack()) + " damage.");
	}
	public static int attack(int attack) {
		int damage = attack;
		
		System.out.print("Attacking.....");
		return damage;
	}
}
