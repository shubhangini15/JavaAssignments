package com.executorservice.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public void executeSer() {
	ExecutorService executorService = Executors.newFixedThreadPool(100);
	
	for(int i = 0; i < 10000; i++) {
		Runnable worker = new WorkerThread("" +i);
		executorService.execute(worker); //calling execute method of ExecutorService
	}
	executorService.shutdown();
	
	while(!executorService.isTerminated()) {
		
	}
	
	System.out.println("Finished all threads");
	
}
}

