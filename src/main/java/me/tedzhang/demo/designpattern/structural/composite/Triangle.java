package me.tedzhang.demo.designpattern.structural.composite;

/**
 * Leaf
 * 
 * @author skuld1012
 */
public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color " + fillColor);
	}

}
