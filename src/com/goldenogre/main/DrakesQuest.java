package com.goldenogre.main;

import com.goldenogre.battlesystem.Battle;
import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;
import com.goldenogre.inventory.LoadItems;

public class DrakesQuest {

	public static void main(String[] args) {
		Hero player01 = new Hero("Damian",100,30, 0, 0, 0, 0, 0,'a');
		Enemy enemy01 = new Enemy("Imp",4,30, 0, 0, 0, 0, 0,'b');
		Battle fight;
		LoadItems load = new LoadItems();
		load.init();
		load.getItemList();
		fight = new Battle(enemy01, 2, player01,1);
		

	}

}
