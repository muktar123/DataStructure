package org.test.ds.concurrent;

public class Participants implements Runnable{
	
	private VideoConference vConf;
	private String name;
	
	public  Participants(VideoConference vconf, String name) {
		 this.vConf = vconf;
		 this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vConf.arrive(name);
		
	}

}
