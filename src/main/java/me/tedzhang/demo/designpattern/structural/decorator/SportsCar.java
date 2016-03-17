package me.tedzhang.demo.designpattern.structural.decorator;

/**
 * Concrete Decorator
 * 
 * @author skuld1012
 *
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}
