package com.techlab.model;

public class Invoice {
	private int id;
	private String name;
	private double amount;
	private double discountPercentage;
	private final float GST = 0.05f;
	
	public Invoice(int id, String name, double amount, double discountPercentage) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double getAmount() {
		return amount;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}
	
	public double calculateDiscount() {
		return (amount * (discountPercentage/100));
	}
	
	public double calculateGST() {
		return (amount * GST)/100;
	}
	
	public double calculateTotalCost() {
		return (this.amount - this.getDiscountPercentage() + this.calculateGST());
	}
}
