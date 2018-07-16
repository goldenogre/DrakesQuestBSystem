package com.goldenogre.entity;

abstract class Entity {
	private String name;
	private int hitPoints;
	private int attack;
	private int critical;
	private int evasion;
	private int defense;
	private int magicDefense;
	private int experience;
	private char resist;
	
	


public Entity(String name, int hitPoints, int attack, int critical, int evasion, int defense, int magicDefense,
		int experience, char resist) {
	super();
	this.name = name;
	this.hitPoints = hitPoints;
	this.attack = attack;
	this.critical = critical;
	this.evasion = evasion;
	this.defense = defense;
	this.magicDefense = magicDefense;
	this.experience = experience;
	this.resist = resist;
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
	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMagicDefense() {
		return magicDefense;
	}

	public void setMagicDefense(int magicDefense) {
		this.magicDefense = magicDefense;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public char getResist() {
		return resist;
	}

	public void setResist(char resist) {
		this.resist = resist;
	}

}
