package org.test.ds.concurrent;

public class CountdownLatchMain {

	public static void main(String[] args) {
		VideoConference vConf = new VideoConference(10);
		Thread thread = new Thread(vConf);
		thread.start();
		
		for(int i=0;i<10;i++){
		Participants part = new Participants(vConf, "name"+i);
		Thread thread1 = new Thread(part);
		thread1.start();
		}
		
	}
}
