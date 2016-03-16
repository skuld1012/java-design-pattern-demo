package me.tedzhang.demo.designpattern.structural.composite;

/**
 * Composite pattern is one of the Structural design pattern and is used when we have to represent 
 * a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure 
 * has to be treated the same way, we can apply composite design pattern.
 * 
 * Composite pattern should be applied only when the group of objects should behave as the single object.
 * Composite pattern can be used to create a tree like structure.
 * 
 * @author skuld1012
 */
public class CompositePatternMain {

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}

}
