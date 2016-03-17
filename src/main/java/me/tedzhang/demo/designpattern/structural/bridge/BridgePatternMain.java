package me.tedzhang.demo.designpattern.structural.bridge;

/**
 * Decouple an abstraction from its implementation so that the two can vary
 * independently.
 * 
 * Bridge design pattern can be used when both abstraction and implementation can have 
 * different hierarchies independently and we want to hide the implementation from the client application.
 * 
 * @author skuld1012
 */
public class BridgePatternMain {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
