package com.gyan.Threads;

public class A2 {
	public static void main(String[] args) {
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println("Runnable");
				}
			}
			
		}).start();
		
				for(int i=0;i<1000;i++)
				{
					System.out.println("thread");
				}
		
		}
	}


