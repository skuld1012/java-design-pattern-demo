package me.tedzhang.demo.designpattern.creational.singleton;

/**
 * Double null-checking with volatile variable to prevent different behavior on various of JVMs.
 * 
 * @author skuld1012
 */
public class SingletonPattern {

	private volatile static SingletonPattern INSTANCE;

	private SingletonPattern() {}

	public final static SingletonPattern getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonPattern.class) {
				INSTANCE = new SingletonPattern();
			}
		}
		return INSTANCE;
	}
}
