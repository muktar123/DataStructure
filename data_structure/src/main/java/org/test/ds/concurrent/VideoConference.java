package org.test.ds.concurrent;

import java.util.concurrent.CountDownLatch;

public class VideoConference implements Runnable{
	
	private final CountDownLatch cdl;
	
	public  VideoConference(int number) {
		 cdl = new CountDownLatch(number);
	}
	
	public void arrive(String name){
		System.out.printf("%s has arrived :\n",name);
		cdl.countDown();
		System.out.printf("\nWaiting for %d participants\n ",cdl.getCount());
	}

	@Override
	public void run() {
		
		ThreadPoolExecutor
		System.out.printf("\nVideo conference initializing, Participants %d \n", cdl.getCount());
		
		try {
			cdl.await();
			System.out.println("\nVideoConference: All the participants have come\n");
			System.out.println("\nVideoConference lets start....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
	}

}
