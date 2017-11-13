package com.simeong.code;

import com.simeong.code.multithreading.ExecutorRunManyManyThreads;
import com.simeong.code.multithreading.ExecutorRunManySingleThread;
import com.simeong.code.multithreading.ExecutorRunManySynchronized;
import com.simeong.code.multithreading.ThreadRun;
import com.simeong.code.multithreading.RunnableRun;
import com.simeong.code.multithreading.ExecutorRun;

/**
 * Runs the methods that solve the challenges and outputs the results to the console.
 */
public class ChallengesDriver {

	public static void main(String[] args) {
		// System.out.println(CodeChallenges.calcClockHandsDegree(11, 10));
		
		_runThread();
	}
	

	private static void _runThread() {
//		ThreadRun.threadIt();
//		RunnableRun.threadIt();
//		ExecutorRun.threadIt();
//		ExecutorRunManySingleThread.threadIt();
//		ExecutorRunManyManyThreads.threadIt();
		ExecutorRunManySynchronized.threadIt();
	}
}
