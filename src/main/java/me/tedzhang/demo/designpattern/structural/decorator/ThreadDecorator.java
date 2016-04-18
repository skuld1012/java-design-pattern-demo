package me.tedzhang.demo.designpattern.structural.decorator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDecorator implements Callable<Integer> {

	private ThreadDecorator threadDecorator;

	private String name;
	
	private int count = 0;

	public ThreadDecorator(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public void setThreadChain(ThreadDecorator threadDecorator) {
		this.threadDecorator = threadDecorator;
	}

	@Override
	public Integer call() {
		try {
			if (threadDecorator != null) {
				FutureTask<Integer> future = new FutureTask<>(this.threadDecorator);
				Thread decoratorThread = new Thread(future);
				decoratorThread.start();
				decoratorThread.join();
				count += future.get();
			}
			System.out.println("Thread " + name + " start processing...");
			Thread.sleep(3000);
			System.out.println("Thread " + name + " finish!");
			return count;
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			return -1;
		}
	}

}
