package me.tedzhang.demo.designpattern.behavioral.templatemethod;

/**
 * The Template Method Pattern defines the skeleton of an algorithm in a method,
 * deferring some steps to subclasses. Template Method lets subclasses redefine
 * certain steps of an algorithm without changing the algorithm's structure.
 * 
 * 1. Template method should consists of certain steps whose order is fixed and for some of the methods, 
 * implementation differs from base class to subclass. Template method should be final.
 * 2. Most of the times, subclasses calls methods from super class but in template pattern, superclass 
 * template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, 
 * we’ll call you.”.
 * 3. Methods in base class with default implementation are referred as Hooks and they are intended to be 
 * overridden by subclasses, if you want some of the methods to be not overridden, you can make them final, 
 * for example in our case we can make buildFoundation() method final because if we don’t want subclasses 
 * to override it.
 * 
 * @author skuld1012
 *
 */
public class TemplateMethodPatternMain {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();

	}

}
