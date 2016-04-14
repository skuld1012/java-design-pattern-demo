package me.tedzhang.demo.designpattern.structural.decorator;

public class ThreadDecoratorMain {

	public static void main(String[] args) {
		ThreadDecorator thread1 = new ThreadDecorator("1");
		ThreadDecorator thread2 = new ThreadDecorator("2");
		ThreadDecorator thread3 = new ThreadDecorator("3");
		ThreadDecorator thread4 = new ThreadDecorator("4");
		
		thread4.setThreadChain(thread3);
		thread3.setThreadChain(thread2);
		thread2.setThreadChain(thread1);
		
		Thread mainThread = new Thread(thread4);
		mainThread.start();
	}

}
