package com.practice.programming.deadLock.thread.java;

public class DeadLock1 {

	String str1 = "Priti";
	String str2 = "Priya";

	Thread T1 = new Thread("My Thread 1") {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	Thread T2 = new Thread("My Thread 2")
			{
		public void run ()
		{
			synchronized (str2)
			{
				synchronized(str1)
				{
					System.out.println(str2+str1);
				}
			}
		}
			};

	public static void main(String[] args) {
		DeadLock1 dl = new DeadLock1 ();
		dl.T1.start();
		dl.T2.start();
	}

}
