package me.tedzhang.demo.designpattern.behavioral.chainofresponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityPatternMain {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				System.exit(0);;
			}
			// process the request
			atmDispenser.getStartChain().dispense(new Currency(amount));
		}
	}

}
