package me.tedzhang.demo.designpattern.structural.decorator;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDecoratorMain {

	public static void main(String[] args) {
		ThreadDecorator thread1 = new ThreadDecorator("1", 1);
		ThreadDecorator thread2 = new ThreadDecorator("2", 2);
		ThreadDecorator thread3 = new ThreadDecorator("3", 3);
		ThreadDecorator thread4 = new ThreadDecorator("4", 4);
		
		thread4.setThreadChain(thread3);
		thread3.setThreadChain(thread2);
		thread2.setThreadChain(thread1);
		
		FutureTask<Integer> future = new FutureTask<>(thread4);
		Thread decoratorThread = new Thread(future);
		decoratorThread.start();
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
