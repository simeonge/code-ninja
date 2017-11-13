package com.simeong.code.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRun {

	public static void threadIt() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executor service running runnable.");
			}
		});
		
		executor.shutdown();
	}
}
