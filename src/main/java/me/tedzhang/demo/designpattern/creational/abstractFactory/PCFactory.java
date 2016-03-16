package me.tedzhang.demo.designpattern.creational.abstractFactory;

import java.util.Optional;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
    private String hdd;
    private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Optional<Computer> createComputer() {
		return Optional.of(new PC(ram, hdd, cpu));
	}
}
