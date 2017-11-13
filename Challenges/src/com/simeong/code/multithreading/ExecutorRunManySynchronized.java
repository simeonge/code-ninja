package com.simeong.code.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorRunManySynchronized {
	
	public static class Doubl {
		private int num = 0;
		
		public int doubleThatShit() {			
			num++;
			return num;
		}
		
		public void reset() {
			num = 0;
		}
	}
	
	public static class DoubleRunner implements Runnable {
		private Doubl d;
		
		DoubleRunner(Doubl doubler) {
			this.d = doubler;
		}

		@Override
		public void run() {
			for (int i = 0; i < 80000000; i++) {
				d.doubleThatShit();
			}
			
			System.out.println(d.num);
		}
	}

	public static void threadIt() {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Doubl d = new Doubl();
		
		for (int i = 0; i < 10; i++) {
			executor.submit(new DoubleRunner(d));
		}

		executor.shutdown();
		
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			executor.shutdownNow();
		}
		
		System.out.println("FINAL ANSWER: " + d.num);
	}
}
