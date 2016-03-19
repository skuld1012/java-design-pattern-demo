package me.tedzhang.demo.designpattern.behavioral.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
