package com.goldenogre.inventory;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LoadItems {
	private static Item item;
	private static ArrayList<Item> itemList;
	
	public void init() {
		  createItem(readItems("src\\com\\goldenogre\\inventory\\items.data"));
		  
	}
	public void getItemList() {
		System.out.println(itemList);
	}
	public static String[] readItems(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int ctr = 0;
			while (s.hasNext()) {
				ctr++;
				s.next();
			}
			
			String[] arr = new String[ctr];
			Scanner s1 = new Scanner(f);
			for (int i = 0; i < arr.length; i++) {
				arr[i]= s1.next();
			}
			
			return arr;
		} catch (Exception e) {
			return null;
		}
	}
	public static void createItem(String[]data) {
		itemList = new ArrayList<Item>();
		
		int bump=5; 
		 
		 for(int i = 0; i < data.length; i ++) {
			 
			 
			 item = new Item(data[bump],Integer.parseInt(data[bump+1]),Integer.parseInt(data[bump+2]),data[bump+3]=="true" ? true:false,data[bump+4]=="true" ? true:false); 
			 bump= bump + 5;
			 itemList.add(item);
		 }
		
		 
		 
	}
}
