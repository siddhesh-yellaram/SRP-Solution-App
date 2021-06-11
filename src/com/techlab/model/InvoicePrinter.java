package com.techlab.model;

public class InvoicePrinter {
	Invoice invoice;
	
	public InvoicePrinter(Invoice in) {
		this.invoice = in;
	}
	
	public void printToConsole() {
		System.out.println("Id: "+invoice.getId());
		System.out.println("Name: "+invoice.getName());
		System.out.println("Amount: "+invoice.getAmount());
		System.out.println("Total Discount: "+invoice.calculateDiscount());
		System.out.println("Total GST: "+invoice.calculateGST());
		System.out.println("Total Cost: "+invoice.calculateTotalCost());
	}
}
