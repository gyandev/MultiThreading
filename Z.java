package com.gyan.Threads;

public class Z {
	static Thread getThread()
	{
		return new Thread()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println("child Thread" +i);
				}
			}
		};
	}
	public static void main(String[] args) {
		Thread t1=getThread();
		t1.start();
		getThread().start();
		getThread().start();
		for(int i=0;i<1000;i++)
		{
			System.out.println("main thread" +i);
		}
		
	}

}
