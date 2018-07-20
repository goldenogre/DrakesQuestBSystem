package com.goldenogre.entity;

public class Hero extends Entity {
	private int level;
	private int magicPoints;
	private int intelligence;
	private char skillKey;
	
	public Hero(String name, int hitPoints, int attack, int critical, int evasion, int defense, int magicDefense,
			int experience, char resist,boolean isDead) {
		super(name, hitPoints, attack, critical, evasion, defense, magicDefense, experience, resist,isDead);
		// TODO Auto-generated constructor stub
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public char getSkillKey() {
		return skillKey;
	}

	public void setSkillKey(char skillKey) {
		this.skillKey = skillKey;
	}
	
	
	

}
