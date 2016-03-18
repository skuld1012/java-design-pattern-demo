package me.tedzhang.demo.designpattern.behavioral.chainofresponsibility;

public class DollarDispenser implements DispenseChain {

	private DispenseChain chain;

	private int amount = 0;

	public DollarDispenser(int amount) {
		this.amount = amount;
	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= this.amount) {
			int num = cur.getAmount() / this.amount;
			int remainder = cur.getAmount() % amount;
			System.out.println("Dispensing " + num + " " + amount + "$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
