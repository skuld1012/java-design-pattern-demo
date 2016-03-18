package me.tedzhang.demo.designpattern.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ATMDispenseChain {

	private final int[] dispenseAmountChain = { 50, 20, 10 };

	private List<DollarDispenser> chains = new LinkedList<>();

	public ATMDispenseChain() {
		// initialize the chain
		Arrays.stream(dispenseAmountChain).forEach(amount -> {
			DollarDispenser dispenser = new DollarDispenser(amount);
			chains.add(dispenser);
			if (chains.size() > 1) {
				chains.get(chains.size() - 2).setNextChain(dispenser);
			}
		});
	}
	
	public DollarDispenser getStartChain() {
		return chains.get(0);
	}
}
