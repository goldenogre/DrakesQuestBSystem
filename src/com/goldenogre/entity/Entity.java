package com.goldenogre.entity;

abstract class Entity {
	private String name;
	private int hitPoints;
	private int attack;
	public Entity(String name, int hitPoints, int attack) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attack = attack;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String toString() {
		return "Entity class name = " + name;
	}

}
