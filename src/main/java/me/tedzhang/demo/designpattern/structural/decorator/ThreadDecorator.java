package me.tedzhang.demo.designpattern.structural.decorator;

public class ThreadDecorator implements Runnable {

	private ThreadDecorator threadDecorator;

	private String name;

	public ThreadDecorator(String name) {
		this.name = name;
	}

	public void setThreadChain(ThreadDecorator threadDecorator) {
		this.threadDecorator = threadDecorator;
	}

	@Override
	public void run() {
		try {
			if (threadDecorator != null) {
				Thread decoratorThread = new Thread(this.threadDecorator);
				decoratorThread.start();
				decoratorThread.join();
			}
			System.out.println("Thread " + name + " start processing...");
			Thread.sleep(3000);
			System.out.println("Thread " + name + " finish!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
