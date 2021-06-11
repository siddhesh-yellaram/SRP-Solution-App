package com.techlab.test;

import com.techlab.model.Invoice;
import com.techlab.model.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice(1,"Sea",5000,10);
		InvoicePrinter ip = new InvoicePrinter(in);
		ip.printToConsole();
	}

}
