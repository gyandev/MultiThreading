package com.gyan.Threads;

public class A1 {
	static Thread getThread()
	{
		return new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println("child Thread");
				}
			}
		});
	}
	public static void main(String[] args) {
		Thread t1=getThread();
		t1.start();
		getThread().start();
		for(int i=0;i<1000;i++)
		{
			System.out.println("main thread");
		}
		
	}

}
