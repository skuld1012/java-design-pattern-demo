package me.tedzhang.demo.designpattern.creational.factory;

import java.util.Optional;

/**
 * Factory pattern provides approach to code for interface rather than implementation.
 * Factory pattern removes the instantiation of actual implementation classes from client code, 
 * making it more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
 * Factory pattern provides abstraction between implementation and client classes through inheritance.
 *
 * @author skuld1012
 *
 */
public class FactoryPatternMain {

	public final static Optional<Computer> getComputer(Class<? extends Computer> type, String ram, String hdd, String cpu) {
		if (type.equals(PC.class))
			return Optional.of(new PC(ram, hdd, cpu));
		else if (type.equals(Server.class))
			return Optional.of(new Server(ram, hdd, cpu));
		else
			return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<Computer> computer = FactoryPatternMain.getComputer(PC.class, "16GB", "2TB", "Intel");
		System.out.println(computer);
	}
}
