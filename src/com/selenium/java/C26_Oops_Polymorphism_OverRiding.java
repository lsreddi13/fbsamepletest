package com.selenium.java;

public class C26_Oops_Polymorphism_OverRiding {

	public static void main(String[] args) {

		// Without Overriding
		Son ch = new Son();
		ch.property();
		ch.business();
		ch.age();

		// With OverRiding
		Parents par = new Son();
		par.property();
		par.business();
		par.age();

	}

}

class Parents {
	void property() {
		System.out.println("parent : Land+LiqhuidCash+Home");
	}

	void business() {
		System.out.println("Parent : SuperMarket");
	}

	void age() {
		System.out.println("Parent : This is Parents Age");
	}

}

class Son extends Parents {
	void property() {
		System.out.println("child : Land+LiquidCash+Villa+AgriLand");
	}

	void business() {
		System.out.println("child : HyperMarket");
	}
}
