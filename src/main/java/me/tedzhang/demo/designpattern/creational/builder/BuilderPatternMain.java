package me.tedzhang.demo.designpattern.creational.builder;

/**
 * Builder design pattern is a creational design pattern like Factory Pattern
 * and Abstract Factory Pattern. This pattern was introduced to solve some of
 * the problems with Factory and Abstract Factory design patterns when the
 * Object contains a lot of attributes.
 * 
 * Actually this is NOT the real builder design pattern. But personally I think
 * it is more useful
 * 
 * @author skuld1012
 */
public class BuilderPatternMain {

	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp);
	}
}
