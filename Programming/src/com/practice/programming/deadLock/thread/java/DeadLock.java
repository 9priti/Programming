package com.practice.programming.deadLock.thread.java;


public class DeadLock   {
	
	public static Object lock1 = new Object ();
	public static Object lock2 = new Object ();

	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1 ();
		ThreadDemo2 T2 = new ThreadDemo2 ();
		T1.start();
		T2.start();

	}

	
	private static class ThreadDemo1 extends Thread
	{
		@Override 
		public void run ()
		{
			synchronized(lock1)
			{
				System.out.println("Thread 1 : Holding Lock 1");
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1 : Waiting for Lock 2");
				synchronized (lock2)
				{		
					System.out.println("Thread1 : Holding Lock 1 and Lock2 ");
				}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread
	{
		
	public void run ()
	{
		synchronized (lock2)
		{
			System.out.println("Thread 2 : Holding Lock 2");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2 : Waiting for Lock 1");
			synchronized (lock1)
			{
				System.out.println("Thread 2 : Holding Lock 1 and Lock 2");
			}
		}
	}
	}
}
