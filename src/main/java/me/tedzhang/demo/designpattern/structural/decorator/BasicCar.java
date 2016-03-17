package me.tedzhang.demo.designpattern.structural.decorator;

/**
 * Component Implementation
 * 
 * @author skuld1012
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}

}
