package com.practice.programming.thread.java;

public class ThreadDemo implements Runnable {

	private String threadName;
	private Thread t;

	public ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating thread--- >" + threadName);
	}

	public static void main(String[] args) {
		ThreadDemo R1 = new ThreadDemo("Thread -1 ");
		R1.start();

		ThreadDemo R2 = new ThreadDemo("Thread -2 ");
		R2.start();

	}

	@Override
	public void run() {
		System.out.println("Running thread-->" + threadName);

		for (int i = 4; i < 4; i--) {
			System.out.println("Thread " + threadName + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Thread  " + threadName + " is interrupted");
				e.printStackTrace();
			}
		}
		System.out.println("Exiting thread  " + threadName);
	}

	public void start() {
		System.out.println("Starting thread " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.run();
		}
	}

}
