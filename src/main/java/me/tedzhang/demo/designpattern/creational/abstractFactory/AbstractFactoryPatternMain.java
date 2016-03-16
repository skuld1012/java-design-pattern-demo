package me.tedzhang.demo.designpattern.creational.abstractFactory;

import java.util.Optional;

/**
 * Abstract Factory pattern provides approach to code for interface rather than implementation.
 * Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, 
 * for example we can add another sub-class Laptop and a factory LaptopFactory.
 * Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 * 
 * @author skuld1012
 */
public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		Optional<Computer> pc = ComputerFactory.getComputerByFactory(new PCFactory("16GB", "2TB", "Intel"));
		Optional<Computer> server = ComputerFactory.getComputerByFactory(new ServerFactory("128GB", "20TB", "Intel"));
		System.out.println(pc);
		System.out.println(server);
	}
}
