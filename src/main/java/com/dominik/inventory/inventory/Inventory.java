package com.dominik.inventory.inventory;

import java.util.HashMap;

import com.dominik.inventory.exceptions.NoProductException;

public class Inventory {

	private HashMap<Integer, Product> inventory;
	
	public Inventory() {
		inventory = new HashMap<Integer, Product>();
	}
	
	public void addProduct(int id, ProductType type, int price, String name, int quantity) {
		inventory.put(id, new Product(id,type, price, name,quantity));
	}
	
	public void removeProduct(int id) {
		inventory.remove(id);
	}
	
	public void addStock(int id, int value) {
		inventory.get(id).addQuantity(value);
	}
	
	public void removeStock(int id, int value) {
		inventory.get(id).removeQuantity(value);
	}
	
	public int getProductQuanity(int id) {
		return inventory.get(id).getQuantity();
	}
	
	public int getProductTotalValue(int id) {
		return inventory.get(id).totalValue();
	}
}
