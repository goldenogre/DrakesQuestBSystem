package com.goldenogre.main;

import java.util.ArrayList;

import com.goldenogre.battlesystem.Battle;
import com.goldenogre.battlesystem.BattleSystem;
import com.goldenogre.entity.Enemy;
import com.goldenogre.entity.Hero;
import com.goldenogre.inventory.LoadItems;

public class DrakesQuest {

	public static void main(String[] args) {
		Hero player01 = new Hero("Fighter",1200,30, 0, 0, 0, 0, 0,'a',false);
		Hero player02 = new Hero("Theif",450,45, 0, 0, 0, 0, 0,'a',false);
		Hero player03 = new Hero("Monk",1330,20, 0, 0, 0, 0, 0,'a',false);
		Hero player04 = new Hero("Wizzard",800,5, 0, 0, 0, 0, 0,'a',false);
		Enemy enemy01 = new Enemy("Lich",200,30, 0, 0, 0, 0, 0,'b',false);
		Enemy enemy02 = new Enemy("Marilith",400,30, 0, 0, 0, 0, 0,'b',false);
		Enemy enemy03 = new Enemy("Kraken",600,20, 0, 0, 0, 0, 0,'b',false);
		Enemy enemy04 = new Enemy("Tiamat",800,40, 0, 0, 0, 0, 0,'b',false);
		ArrayList<Hero> Hgroup = new ArrayList<Hero>();
		Enemy enemy05 = new Enemy("Chaos",1000,20, 0, 0, 0, 0, 0,'b',false);
		ArrayList<Enemy> Egroup = new ArrayList<Enemy>();
        Hgroup.add(player01);
        Hgroup.add(player02);
        Hgroup.add(player03);
        Hgroup.add(player04);
        Egroup.add(enemy01);
        Egroup.add(enemy02);
        Egroup.add(enemy03);
        Egroup.add(enemy04);
        Egroup.add(enemy05);
        
		BattleSystem fight;
		LoadItems load = new LoadItems();
		//load.init();
		//load.getItemList();
		fight = new BattleSystem(Hgroup,Egroup); // hero enemy
		

	}

}
