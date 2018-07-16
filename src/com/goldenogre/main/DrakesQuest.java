package com.goldenogre.main;

import com.goldenogre.battlesystem.Battle;
import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;

public class DrakesQuest {

	public static void main(String[] args) {
		Hero player_1 = new Hero("Damian",100,30);
		Enemy imp = new Enemy("Imp",4,30);
		Battle fight;
		
		fight = new Battle(imp,player_1);
		

	}

}
