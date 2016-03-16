package me.tedzhang.demo.designpattern.creational.abstractFactory;

import java.util.Optional;

public class ComputerFactory {

	public final static Optional<Computer> getComputerByFactory(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
