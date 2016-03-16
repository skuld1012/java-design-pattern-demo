package me.tedzhang.demo.designpattern.creational.abstractFactory;

import java.util.Optional;

public class ServerFactory implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Optional<Computer> createComputer() {
		return Optional.of(new Server(ram, hdd, cpu));
	}

}
