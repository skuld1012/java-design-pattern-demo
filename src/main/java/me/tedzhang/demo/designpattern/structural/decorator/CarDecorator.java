package me.tedzhang.demo.designpattern.structural.decorator;

/**
 * Decorator
 * 
 * @author skuld1012
 *
 */
public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
