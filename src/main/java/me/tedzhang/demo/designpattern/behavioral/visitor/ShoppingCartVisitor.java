package me.tedzhang.demo.designpattern.behavioral.visitor;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}
