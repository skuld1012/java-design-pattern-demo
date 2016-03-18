package me.tedzhang.demo.designpattern.behavioral.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}
