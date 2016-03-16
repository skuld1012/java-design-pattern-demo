package me.tedzhang.demo.designpattern.creational.abstractFactory;

import java.util.Optional;

public interface ComputerAbstractFactory {

	public Optional<Computer> createComputer(); 
}
