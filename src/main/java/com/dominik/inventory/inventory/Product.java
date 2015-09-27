package com.dominik.inventory.inventory;

public class Product {

	private int id;
	private int price;
	private ProductType type;
	private String name;
	private int quantity;
	
	public Product(int id, ProductType type, int price,  String name, int quantity) {
		setPrice(price);
		setID(id);
		setType(type);
		setName(name);
		setQuantity(quantity);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setType(ProductType type) {
		this.type=type;
	}
	
	public ProductType getType() {
		return this.type;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addQuantity(int quantity) {
		if (quantity >= 0 ) this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		if (this.quantity-quantity >=0) this.quantity -= quantity;
	}
	
	public int totalValue() {
		if(quantity > 0) return this.quantity * this.price;
		else System.out.println("stock of the product is empty");
		return 0;
	}
}
