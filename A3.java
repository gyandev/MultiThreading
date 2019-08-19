package com.gyan.Threads;
public class A3 {

	static Runnable getRunnable()
	{
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable");
			}
		};
	}
	public static Thread getThread()
	{
		return new Thread(getRunnable());
	}
	public static Thread getThread1()
	{
		return new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("getThread1");
			}
		};
	}
	public static Thread getThread2()
	{
		return new Thread(getRunnable())
		{
			@Override
			public void run()
			{
				System.out.println("getThread2");
			}
		};
	}
public static void main(String[] args) {
		
	new Thread(getRunnable()).start();
	getThread().start();
	getThread1().start();
	getThread2().start();
	System.out.println("done");
	}

}
