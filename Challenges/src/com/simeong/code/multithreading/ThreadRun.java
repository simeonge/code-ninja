package com.simeong.code.multithreading;

public class ThreadRun {

	public static void threadIt() {
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 running.");
			}
		}.start();
	}
}
