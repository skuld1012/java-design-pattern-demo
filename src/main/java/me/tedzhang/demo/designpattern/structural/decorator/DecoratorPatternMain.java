package me.tedzhang.demo.designpattern.structural.decorator;

/**
 * 1. Decorator pattern is helpful in providing runtime modification abilities and hence more flexible. 
 * Its easy to maintain and extend when the number of choices are more.
 * 2. The disadvantage of decorator pattern is that it uses a lot of similar kind of objects (decorators).
 * 3. Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 * 
 * @author skuld1012
 */
public class DecoratorPatternMain {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
