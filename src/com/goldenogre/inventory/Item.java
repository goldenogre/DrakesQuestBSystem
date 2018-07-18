package com.goldenogre.inventory;

import java.io.File;
import java.util.Scanner;

public class Item {
	private String name;
	private int quantity;
	private int price; // selling will always be 1/2 original
	private boolean inBattle;
	private boolean inMenue;
	public Item(String name, int quantity, int price, boolean inBattle, boolean inMenue) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.inBattle = inBattle;
		this.inMenue = inMenue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isInBattle() {
		return inBattle;
	}
	public void setInBattle(boolean inBattle) {
		this.inBattle = inBattle;
	}
	public boolean isInMenue() {
		return inMenue;
	}
	public void setInMenue(boolean inMenue) {
		this.inMenue = inMenue;
	}
	
	
	

}
