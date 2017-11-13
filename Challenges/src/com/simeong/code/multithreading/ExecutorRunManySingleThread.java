package com.simeong.code.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunManySingleThread {

	public static void threadIt() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 20; i++) {
						if (i == 17) {
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("Slept ---------------------------------");
						}
						System.out.println("Executor service running runnables: " + i);
					}
				}
			});
		}
		
		executor.shutdown();
	}
}
