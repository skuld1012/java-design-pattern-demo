package me.tedzhang.demo.designpattern.structural.decorator;

/**
 * Concrete Decorator
 * 
 * @author skuld1012
 *
 */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
