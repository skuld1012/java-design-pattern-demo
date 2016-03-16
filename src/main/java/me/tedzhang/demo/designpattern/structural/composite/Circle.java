package me.tedzhang.demo.designpattern.structural.composite;

/**
 * Leaf
 * 
 * @author skuld1012
 */
public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}

}
