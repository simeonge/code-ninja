package com.simeong.code.multithreading;

public class RunnableRun {

	public static void threadIt() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread running runnable.");
			}
		}).start();
	}
}
